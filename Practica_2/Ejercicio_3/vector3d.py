import math
class Vector3D:
    def __init__(self, a1=0.0, a2=0.0, a3=0.0):
        self.__a1 = float(a1)
        self.__a2 = float(a2)
        self.__a3 = float(a3)
    def __add__(self, o):
        if isinstance(o, Vector3D):
            return Vector3D(self.__a1 + o.__a1, self.__a2 + o.__a2, self.__a3 + o.__a3)
        return NotImplemented
    def __mul__(self, r):
        if isinstance(r, (int, float)):
            return Vector3D(self.__a1 * r, self.__a2 * r, self.__a3 * r)
        return NotImplemented
    def __rmul__(self, r):
        return self.__mul__(r)
    def longitud(self):
        return math.sqrt(self.__a1**2 + self.__a2**2 + self.__a3**2)
    def normal(self):
        long = self.longitud()
        if long == 0:
            raise ValueError("No se puede normalizar un vector nulo (longitud cero).")
        return Vector3D(self.__a1 / long, self.__a2 / long, self.__a3 / long)
    def producto_escalar(self, o):
        if isinstance(o, Vector3D):
            return self.__a1 * o.__a1 + self.__a2 * o.__a2 + self.__a3 * o.__a3
        raise TypeError("La operación requiere otro objeto Vector3D.")
    def producto_vectorial(self, o):
        if isinstance(o, Vector3D):
            v1 = self.__a2 * o.__a3 - self.__a3 * o.__a2
            v2 = self.__a3 * o.__a1 - self.__a1 * o.__a3
            v3 = self.__a1 * o.__a2 - self.__a2 * o.__a1
            return Vector3D(v1, v2, v3)
        raise TypeError("La operación requiere otro objeto Vector3D.")
    def __str__(self):
        return f"({self.__a1:.2f}, {self.__a2:.2f}, {self.__a3:.2f})"
