package validacionContrasenia;

import java.util.Scanner;

public class menuValidacionContrasenia {
    public static void mostrarMenu(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("=== Validación de Contraseña ===");
            validacionContrasenia.validarContrasenia(scanner);

            System.out.print("¿Desea realizar otra operación en el conversor de monedas? (Si/No): ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("Si")) {
                continuar = false;
            }
        }
    }
}
