package conversorDeMonedas;

import java.util.Scanner;

public class menuConversorDeMonedas {
    public static void mostrarMenu(Scanner scanner) {
        boolean salir = false;

        while (!salir) {
            System.out.println("=== Conversor de Monedas ===");
            System.out.println("1. Convertir Pesos Argentinos a Dólares");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    conversorDeMonedas.convertirPesosADolares(scanner);
                    break;
                case 2:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
            }
        }
    }
}