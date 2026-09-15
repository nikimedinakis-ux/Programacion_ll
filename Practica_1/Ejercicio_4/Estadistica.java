package Ejercicio_4;

public class Estadistica {
    
    private double[] numeros;

    public Estadistica(double[] numeros) {
        this.numeros = numeros;
    }

    public double promedio() {
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma / numeros.length;
    }

    public double desviacion() {
        double prom = promedio();
        double sumaDiferencias = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            sumaDiferencias += Math.pow(numeros[i] - prom, 2);
        }
        
        return Math.sqrt(sumaDiferencias / (numeros.length - 1));
    }
}
