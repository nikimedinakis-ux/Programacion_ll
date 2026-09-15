package Ejercicio_4;

import java.util.Scanner;

public class EstadisticaModular {
    
    public static double calcularPromedio(double[] numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    public static double calcularDesviacion(double[] numeros) {
        double prom = calcularPromedio(numeros);
        double sumaDiferencias = 0;
        for (double num : numeros) {
            sumaDiferencias += Math.pow(num - prom, 2);
        }
        return Math.sqrt(sumaDiferencias / (numeros.length - 1));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] datos = new double[10];

        System.out.println("--- MÓDULO ESTRUCTURADO ---");
        System.out.println("Ingrese 10 números (separados por espacios):");
        for (int i = 0; i < 10; i++) {
            datos[i] = entrada.nextDouble();
        }

        System.out.printf("El promedio es %.2f\n", calcularPromedio(datos));
        System.out.printf("La desviación estandard es %.5f\n", calcularDesviacion(datos));
        
        entrada.close();
    }
}
