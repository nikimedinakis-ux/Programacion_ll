package Ejercicio_2;
public class Juego {
    protected int numeroDeVidas;
    protected int record;
    private int vidasIniciales;
    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.vidasIniciales = numeroDeVidas;
        this.record = 0;
    }
    public void reiniciaPartida() {
        this.numeroDeVidas = this.vidasIniciales;
        System.out.println("\n--- Partida Reiniciada | Vidas: " + this.numeroDeVidas + " ---");
    }
    public void actualizaRecord() {
        if (this.numeroDeVidas > this.record) {
            this.record = this.numeroDeVidas;
            System.out.println("¡NUEVO RÉCORD! Tu récord actual es de " + this.record + " vidas.");
        }
    }
    public boolean quitaVida() {
        this.numeroDeVidas--;
        return this.numeroDeVidas > 0;
    }
}
