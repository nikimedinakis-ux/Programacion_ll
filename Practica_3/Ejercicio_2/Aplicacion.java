package Ejercicio_2;
public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("=== INSTANCIAS DE JUEGOS ===");
        
        JuegoAdivinaNumero j1 = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar j2 = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar j3 = new JuegoAdivinaImpar(3);

        System.out.println("\n--- JUEGO NORMAL ---");
        j1.juega();

        System.out.println("\n--- JUEGO PAR ---");
        j2.juega();

        System.out.println("\n--- JUEGO IMPAR ---");
        j3.juega();
    }
}
