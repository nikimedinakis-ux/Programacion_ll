package Ejercicio_3;
public class Sensor {
    public static String tipo = "Genérico"; 
    protected String id;
    protected boolean encendido;

    public Sensor(String id) {
        this.id = id;
        this.encendido = false;
    }
    public void activar() {
        this.encendido = true;
        System.out.println("Sensor " + this.id + " -> ACTIVADO.");
    }
    public void desactivar() {
        this.encendido = false;
        System.out.println("Sensor " + this.id + " -> DESACTIVADO.");
    }
}
