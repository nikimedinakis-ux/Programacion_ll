package Ejercicio_2;
public class TestVectorial {
    public static void main(String[] args) {
        AlgebraVectorial a = new AlgebraVectorial(3, 4, 0);
        AlgebraVectorial b = new AlgebraVectorial(-4, 3, 0); 
        AlgebraVectorial c = new AlgebraVectorial(6, 8, 0);  
        System.out.println("Vector a: " + a);
        System.out.println("Vector b: " + b);
        System.out.println("Vector c: " + c);
        System.out.println("--------------------------------------------");
        System.out.println("¿a es perpendicular a b? (Criterio c): " + a.perpendicular(b));
        System.out.println("¿a es perpendicular a b? (Criterio a): " + a.perpendicular(b, 'a'));
        System.out.println("¿a es perpendicular a b? (Criterio d): " + a.perpendicular(b, 'd'));
        System.out.println("¿a es paralelo a c? (Criterio f): " + a.paralela(c));
        System.out.println("¿a es paralelo a c? (Criterio e): " + a.paralela(c, 'e'));
        System.out.println("Proyección de a sobre c: " + a.proyeccion_de_a_sobre_b(c));
        System.out.printf("Componente de a en c: %.2f\n", a.componente_de_a_en_b(c));
    }
}
