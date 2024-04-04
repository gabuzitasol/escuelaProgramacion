package cuentaBancaria;

import java.util.Scanner;

public class menuCuentaBancaria {
    public static void mostrarMenu(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            cuentaBancaria miCuenta = new cuentaBancaria("cuentaSoledad", 5000000.00);
            System.out.println("=== Menú Cuenta Bancaria ===");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            int dinero;
            switch (opcion) {
                case 1:
                    System.out.println("=== Ingrese la cantidad que desea depositar ===");
                    dinero = scanner.nextInt();
                    miCuenta.depositar(dinero);
                    miCuenta.consultarSaldo();
                    break;
                case 2:
                    System.out.println("=== Ingrese la cantidad que desea retirar ===");
                    dinero = scanner.nextInt();
                    miCuenta.retirar(dinero);
                    miCuenta.consultarSaldo();
                    break;
                case 3:
                    miCuenta.consultarSaldo();
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
            }
            System.out.print("¿Desea realizar otra operación con la Cuenta Bancaria? (Si/No): ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("Si")) {
                continuar = false;
            }
        }
    }
}
