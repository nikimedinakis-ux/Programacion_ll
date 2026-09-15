from vector3d import Vector3D
def main():

    a = Vector3D(1, 2, 3)
    b = Vector3D(4, 5, 6)
    r = 2.5

    print(f"Vector a: {a}")
    print(f"Vector b: {b}")
    print(f"Escalar r: {r}")
    print("-" * 45)

    c = a + b
    print(f"a) Suma (a + b) = {c}")

    b_escalar1 = a * r
    b_escalar2 = r * a
    print(f"b) Multiplicación (a * r) = {b_escalar1}")
    print(f"   Multiplicación (r * a) = {b_escalar2}")

    print(f"c) Longitud de a |a| = {a.longitud():.4f}")

    print(f"d) Normal de a = {a.normal()}")

    prod_esc = a.producto_escalar(b)
    print(f"e) Producto escalar (a · b) = {prod_esc:.2f}")

    prod_vec = a.producto_vectorial(b)
    print(f"f) Producto vectorial (a x b) = {prod_vec}")

if __name__ == "__main__":
    main()
