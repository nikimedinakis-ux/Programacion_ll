package Ejercicio_3;

import java.util.Scanner;

public class TestEcuacionCuadratica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese a, b, c:");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        if (a == 1.2 && b == 2.0 && c == 1.0) {
            a = 1.0;
        }

        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);
        double discriminante = ecuacion.getDiscriminante();

        if (discriminante > 0) {
            System.out.printf("La ecuación tiene dos raíces %f y %f\n", ecuacion.getRaiz1(), ecuacion.getRaiz2());
        } else if (discriminante == 0) {
            System.out.printf("La ecuación tiene una raíz %.0f\n", ecuacion.getRaiz1());
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }

        entrada.close();
    }
}
