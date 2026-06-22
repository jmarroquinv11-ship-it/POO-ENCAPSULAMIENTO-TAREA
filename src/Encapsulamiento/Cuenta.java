package Encapsulamiento;

public class Cuenta {

    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (saldo - monto >= 0) {
            saldo -= monto;
        } else {
            System.out.println("SALDO INSUFICIENTE...");
        }
    }

    public void mostrarCuenta() {
        System.out.println("TITULAR: " + titular);
        System.out.println("SALDO: " + saldo);
    }
}