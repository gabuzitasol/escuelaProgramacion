package conversorDeMonedas;

import calculadoraIMC.calculadoraIMC;

import java.util.Scanner;

public class menuConversorDeMonedas {
    public static void mostrarMenu(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("=== Conversor de Monedas ===");
            conversorDeMonedas.convertirPesosADolares(scanner);

            System.out.print("¿Desea realizar otra operación en el conversor de monedas? (Si/No): ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("Si")) {
                continuar = false;
            }
        }
    }
}