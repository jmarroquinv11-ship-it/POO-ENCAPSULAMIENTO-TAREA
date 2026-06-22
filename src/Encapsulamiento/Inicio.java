package Encapsulamiento;

public class Inicio {

    public static void main(String[] args) {

        // EJERCICIO 1
        Persona pers1 = new Persona("PEDRO JOSÉ", "PÉREZ ALAY", 58);
        Persona pers2 = new Persona("IVAN", "SALAZAR", 22);
        Persona pers3 = new Persona("MARÍA BEATRIZ", "HERNÁNDEZ", 31);

        pers1.mostrarPersona();
        pers2.mostrarPersona();
        pers3.mostrarPersona();

        System.out.println("--------------------------");

        // EJERCICIO 2
        Rectangulo rec1 = new Rectangulo(25, 4);
        Rectangulo rec2 = new Rectangulo(75, 6);

        if (rec1.area() > rec2.area()) {
            System.out.println("EL RECTANGULO 1 TIENE MAYOR AREA");
        } else {
            System.out.println("EL RECTANGULO 2 TIENE MAYOR AREA");
        }

        System.out.println("--------------------------");

        // EJERCICIO 3
        Producto prod1 = new Producto("01", "Computadora Acer", 9949.69);
        Producto prod2 = new Producto("02", "Lays", 4.00);

        prod1.aplicarDescuento(50);
        prod2.aplicarDescuento(4);

        prod1.mostrarProducto();
        prod2.mostrarProducto();

        System.out.println("--------------------------");

        // EJERCICIO 4
        Cuenta c1 = new Cuenta("MATEO", 50000);

        c1.depositar(500);
        c1.retirar(200);
        c1.retirar(800);

        c1.mostrarCuenta();

        System.out.println("--------------------------");

        // EJERCICIO 5
        Libro l1 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1000);
        Libro l2 = new Libro("El Alquimista", "Paulo Coelho", 200);
        Libro l3 = new Libro("Crimen y Castigo", "Fiodor Dostoievski", 700);

        l1.mostrarLibro();
        System.out.println("¿Es largo? " + l1.esLargo());

        l2.mostrarLibro();
        System.out.println("¿Es largo? " + l2.esLargo());

        l3.mostrarLibro();
        System.out.println("¿Es largo? " + l3.esLargo());

        System.out.println("--------------------------");

        // EJERCICIO 6
        Calculadora cal1 = new Calculadora();

        System.out.println("SUMA: " + cal1.sumar(5, 8));
        System.out.println("RESTA: " + cal1.restar(8, 5));
        System.out.println("MULTIPLICACION: " + cal1.multiplicar(78, 20));
        System.out.println("DIVISION: " + cal1.dividir(45, 0));

        System.out.println("--------------------------");

        // EJERCICIO 7
        Fecha f1 = new Fecha(15, 6, 2026);
        Fecha f2 = new Fecha(35, 8, 2026);
        Fecha f3 = new Fecha(20, 15, 2026);

        f1.mostrarFecha();
        f2.mostrarFecha();
        f3.mostrarFecha();
    }
}