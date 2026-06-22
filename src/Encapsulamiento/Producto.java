package Encapsulamiento;

public class Producto {

    private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public void aplicarDescuento(double porcentaje) {
        double descuento = precio * porcentaje / 100;
        precio = precio - descuento;
    }

    public void mostrarProducto() {
        System.out.println("Código: " + codigo);
        System.out.println("EL PRODUCTO ES: " + nombre);
        System.out.println("EL PRECIO ES: " + precio);
    }
}