package Ejercicio_2;
import java.util.Scanner;
import java.util.Random;
public class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;
    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }
    public void juega() {
        reiniciaPartida();
        Random random = new Random();
        this.numeroAAdivinar = random.nextInt(11);
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.print("Adivine un número entre el 0 y el 10: ");
            int usuario = teclado.nextInt();
            if (!validaNumero(usuario)) {
                continue; 
            }
            if (usuario == this.numeroAAdivinar) {
                System.out.println("¡¡Acertaste!!");
                actualizaRecord();
                break;
            } else {
                if (quitaVida()) {
                    String pista = (this.numeroAAdivinar > usuario) ? "MAYOR" : "MENOR";
                    System.out.println("¡Incorrecto! El número es " + pista + ". Te quedan " + this.numeroDeVidas + " vidas.");
                } else {
                    System.out.println("Game Over. El número era: " + this.numeroAAdivinar);
                    break;
                }
            }
        }
    }
}
