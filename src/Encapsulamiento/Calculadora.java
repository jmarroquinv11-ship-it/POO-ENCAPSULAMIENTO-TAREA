package Encapsulamiento;

public class Calculadora {

    public float sumar(float a, float b) {
        return a + b;
    }

    public float restar(float a, float b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public float dividir(float a, float b) {
        if (b == 0) {
            System.out.println("NO ES POSIBLE DIVIDIR ENTRE 0...");
            return 0;
        }

        return a / b;
    }
}