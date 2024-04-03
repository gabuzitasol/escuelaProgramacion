package calculadoraIMC;

import java.util.Scanner;

public class menuCalculadoraIMC {
    public static void mostrarMenu(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("=== Calculadora Indice Masa Corporal ===");
            calculadoraIMC.calcularIMC(scanner);

            System.out.print("¿Desea realizar otra operación en la calculadora de IMC? (Si/No): ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("Si")) {
                continuar = false;
            }
        }
    }
}