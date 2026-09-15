package Ejercicio_2;
public class AlgebraVectorial {
    private double x, y, z;
    public AlgebraVectorial() {
        this.x = 0; this.y = 0; this.z = 0;
    }
    public AlgebraVectorial(double x, double y) {
        this.x = x; this.y = y; this.z = 0;
    }
    public AlgebraVectorial(double x, double y, double z) {
        this.x = x; this.y = y; this.z = z;
    }
    public double norma() {
        return Math.sqrt(x*x + y*y + z*z);
    }
    public double productoPunto(AlgebraVectorial o) {
        return this.x * o.x + this.y * o.y + this.z * o.z;
    }
    public AlgebraVectorial productoCruz(AlgebraVectorial o) {
        return new AlgebraVectorial(
            this.y * o.z - this.z * o.y,
            this.z * o.x - this.x * o.z,
            this.x * o.y - this.y * o.x
        );
    }
    public AlgebraVectorial sumar(AlgebraVectorial o) {
        return new AlgebraVectorial(this.x + o.x, this.y + o.y, this.z + o.z);
    }
    public AlgebraVectorial restar(AlgebraVectorial o) {
        return new AlgebraVectorial(this.x - o.x, this.y - o.y, this.z - o.z);
    }
    public AlgebraVectorial multiplicarEscalar(double r) {
        return new AlgebraVectorial(this.x * r, this.y * r, this.z * r);
    }
    public boolean perpendicular(AlgebraVectorial b) {
        return Math.abs(this.productoPunto(b)) < 1e-9;
    }
    public boolean perpendicular(AlgebraVectorial b, char criterio) {
        switch (criterio) {
            case 'a':
                return Math.abs(this.sumar(b).norma() - this.restar(b).norma()) < 1e-9;
            case 'b': 
                return Math.abs(this.restar(b).norma() - b.restar(this).norma()) < 1e-9;
            case 'd':
                double izq = Math.pow(this.sumar(b).norma(), 2);
                double der = Math.pow(this.norma(), 2) + Math.pow(b.norma(), 2);
                return Math.abs(izq - der) < 1e-9;
            case 'c':
            default:
                return perpendicular(b);
        }
    }
    public boolean paralela(AlgebraVectorial b) {
        return Math.abs(this.productoCruz(b).norma()) < 1e-9;
    }
    public boolean paralela(AlgebraVectorial b, char criterio) {
        if (criterio == 'e') { 
            double r = (b.x != 0) ? this.x / b.x : (b.y != 0) ? this.y / b.y : (b.z != 0) ? this.z / b.z : 0;
            AlgebraVectorial rb = b.multiplicarEscalar(r);
            return Math.abs(this.x - rb.x) < 1e-9 && Math.abs(this.y - rb.y) < 1e-9 && Math.abs(this.z - rb.z) < 1e-9;
        }
        return paralela(b);
    }
    public AlgebraVectorial proyeccion_de_a_sobre_b(AlgebraVectorial b) {
        double numerador = this.productoPunto(b);
        double denominador = Math.pow(b.norma(), 2);
        return b.multiplicarEscalar(numerador / denominador);
    }
    public double componente_de_a_en_b(AlgebraVectorial b) {
        return this.productoPunto(b) / b.norma();
    }
    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }
}
