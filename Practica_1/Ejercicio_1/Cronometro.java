public class Cronometro {
    private long inicia;
    private long finaliza;

    public Cronometro() {
        this.inicia = System.currentTimeMillis();
    }

    public long getInicia() {
        return this.inicia;
    }

    public long getFinaliza() {
        return this.finaliza;
    }

    public void inicia() {
        this.inicia = System.currentTimeMillis();
    }

    public void detener() {
        this.finaliza = System.currentTimeMillis();
    }

    public long lapsoDeTiempo() {
        return this.finaliza - this.inicia;
    }
}
