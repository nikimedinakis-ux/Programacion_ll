package Ejercicio_2;
public class JuegoAdivinaPar extends JuegoAdivinaNumero {
    public JuegoAdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    @Override
    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10 && numero % 2 == 0) {
            return true;
        }
        System.out.println("Error: El número debe ser PAR y estar entre 0 y 10.");
        return false;
    }
}
