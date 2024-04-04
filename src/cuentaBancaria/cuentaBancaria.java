package cuentaBancaria;

public class cuentaBancaria {
    private String numeroCuenta;
    private Double saldo;

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public cuentaBancaria() {
    }

    public cuentaBancaria(String numeroCuenta, Double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // Método para depositar dinero en la cuenta
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se ha depositado $" + cantidad + " en la cuenta.");
        } else {
            System.out.println("Error: La cantidad a depositar debe ser mayor que cero.");
        }
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Se ha retirado $" + cantidad + " de la cuenta.");
        } else {
            System.out.println("Error: Fondos insuficientes o cantidad no válida para retirar.");
        }
    }

    // Método para consultar el saldo actual de la cuenta
    public void consultarSaldo() {
        System.out.println("El saldo actual de la cuenta " + numeroCuenta + " es: $" + saldo);
    }

}