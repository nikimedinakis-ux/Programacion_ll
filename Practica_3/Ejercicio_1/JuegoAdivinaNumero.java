package Ejercicio_1;
import java.util.Scanner;
import java.util.Random;
public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;
    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    public void juega() {
        reiniciaPartida();
        Random random = new Random();
        this.numeroAAdivinar = random.nextInt(11); 
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.print("Adivine un número entre el 0 y el 10: ");
            int usuario = teclado.nextInt();
            if (usuario == this.numeroAAdivinar) {
                System.out.println("¡¡Acertaste!!");
                actualizaRecord();
                break;
            } else {
                if (quitaVida()) {
                    String pista = (this.numeroAAdivinar > usuario) ? "MAYOR" : "MENOR";
                    System.out.println("¡Incorrecto! El número secreto es " + pista + ". Te quedan " + this.numeroDeVidas + " vidas.");
                } else {
                    System.out.println("Game Over. Ya no te quedan más vidas. El número era: " + this.numeroAAdivinar);
                    break;
                }
            }
        }
        teclado.close(); 
    }
}
