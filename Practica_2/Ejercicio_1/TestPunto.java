package Ejercicio_1;
public class TestPunto {
    public static void main(String[] args) {
        MiPunto p1 = new MiPunto(); 
        MiPunto p2 = new MiPunto(10, 30.5);
        double dist = p1.distancia(p2);
        System.out.println("Punto 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Punto 2: (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.printf("La distancia entre ellos es: %.4f\n", dist);
    }
}

