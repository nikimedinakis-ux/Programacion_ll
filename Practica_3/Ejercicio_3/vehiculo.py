class Sensor:
    tipo = "Genérico"
    def __init__(self, id_sensor):
        self.id = id_sensor
        self.encendido = False
    def activar(self):
        self.encendido = True
        print(f"Sensor {self.id} -> ACTIVADO.")
    def desactivar(self):
        self.encendido = False
        print(f"Sensor {self.id} -> DESACTIVADO.")
class Camara(Sensor):
    tipo = "Cámara"
    def __init__(self, id_sensor, resolucion):
        Sensor.__init__(self, id_sensor)
        self.resolucion = resolucion
class SensorLuzLaser(Sensor):
    tipo = "Luz Laser"
    def __init__(self, id_sensor, alcance):
        Sensor.__init__(self, id_sensor)
        self.alcance = alcance
class VehiculoAutonomo(Camara, SensorLuzLaser):
    tipo = "Vehículo Autónomo"
    def __init__(self, id_sensor, resolucion, alcance):
        Camara.__init__(self, id_sensor, resolucion)
        SensorLuzLaser.__init__(self, id_sensor, alcance)
if __name__ == "__main__":
    print("--- Creando Objeto Vehículo Autónomo ---")
    tesla = VehiculoAutonomo(id_sensor="VA-2026", resolucion="4K", alcance=150)
    print(f"Atributo de Clase (tipo): {VehiculoAutonomo.tipo}")
    print(f"Atributo de Instancia (id): {tesla.id}")
    print(f"Atributo de Instancia (resolución): {tesla.resolucion}")
    print(f"Atributo de Instancia (alcance): {tesla.alcance} metros")
    tesla.activar()
    print(f"¿Estado encendido?: {tesla.encendido}")
    tesla.desactivar()
