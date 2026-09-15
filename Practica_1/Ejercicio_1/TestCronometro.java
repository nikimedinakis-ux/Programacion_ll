import java.util.Random;

public class TestCronometro {
    public static void main(String[] args) {
        int tamano = 100000;
        int[] numeros = new int[tamano];
        Random rand = new Random();

        for (int i = 0; i < tamano; i++) {
            numeros[i] = rand.nextInt(100000);
        }

        System.out.println("Ordenando 100,000 números por selección...");
        
        Cronometro reloj = new Cronometro();
        reloj.inicia();

        for (int i = 0; i < tamano - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < tamano; j++) {
                if (numeros[j] < numeros[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int temporal = numeros[indiceMinimo];
            numeros[indiceMinimo] = numeros[i];
            numeros[i] = temporal;
        }

        reloj.detener();

        System.out.println("¡Ordenación completa!");
        System.out.println("Tiempo transcurrido: " + reloj.lapsoDeTiempo() + " milisegundos.");
    }
}
