package Ejercicio_3;
public class VehiculoAutonomo extends Sensor implements CamaraInterface, SensorLuzLaserInterface {
    public static String tipo = "Vehículo Autónomo"; 
    private String resolucion; 
    private int alcance;
    public VehiculoAutonomo(String id, String resolucion, int alcance) {
        super(id);
        this.resolucion = resolucion;
        this.alcance = alcance;
    }
    @Override
    public String getResolucion() {
        return this.resolucion;
    }
    @Override
    public int getAlcance() {
        return this.alcance;
    }
    public static void main(String[] args) {
        System.out.println("--- Sistema de Vehículo Autónomo ---");
        VehiculoAutonomo vehiculo = new VehiculoAutonomo("VA-2026", "4K", 200);

        System.out.println("Atributo de clase (tipo): " + VehiculoAutonomo.tipo);
        System.out.println("Atributo de instancia (id): " + vehiculo.id);
        System.out.println("Atributo de instancia (resolución): " + vehiculo.getResolucion());
        System.out.println("Atributo de instancia (alcance): " + vehiculo.getAlcance() + " metros");

        vehiculo.activar();
        System.out.println("¿Está encendido?: " + vehiculo.encendido);
        vehiculo.desactivar();
    }
}
