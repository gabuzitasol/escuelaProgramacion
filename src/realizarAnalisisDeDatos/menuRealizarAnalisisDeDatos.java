package realizarAnalisisDeDatos;

import java.util.Scanner;

public class menuRealizarAnalisisDeDatos {
    public static void mostrarMenu(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("=== Realizar Analisis de Datos ===");
            realizarAnalisisDeDatos.realizarAnalisisDatos(scanner);

            System.out.print("¿Desea realizar otra operación en el analizador de datos? (Si/No): ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("Si")) {
                continuar = false;
            }
        }
    }
}