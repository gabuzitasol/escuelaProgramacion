package ordenarNumeros;

import java.util.Scanner;

public class menuOrdenarNumeros {
    public static void mostrarMenu(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("=== Ordenador de Números ===");
            ordenarNumeros.ordenaNumeros(scanner);

            System.out.print("¿Desea realizar otra operación en el ordenador de números? (Si/No): ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("Si")) {
                continuar = false;
            }
        }
    }
}
