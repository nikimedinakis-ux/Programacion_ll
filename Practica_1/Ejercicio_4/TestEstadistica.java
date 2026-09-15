package Ejercicio_4;

import java.util.Scanner;

public class TestEstadistica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] datos = new double[10];

        System.out.println("Ingrese 10 números (separados por espacios):");
        
        for (int i = 0; i < 10; i++) {
            datos[i] = entrada.nextDouble();
        }

        Estadistica est = new Estadistica(datos);

        System.out.printf("El promedio es %.2f\n", est.promedio());
        System.out.printf("La desviación estandard es %.5f\n", est.desviacion());

        entrada.close();
    }
}
