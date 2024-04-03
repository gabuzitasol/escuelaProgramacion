package validacionContrasenia;

import java.util.Scanner;

public class validacionContrasenia {
    public static void validarContrasenia(Scanner scanner) {
        // Solicitar al usuario que ingrese una contraseña
        System.out.println("Ingrese una contraseña:");
        String contrasenia = scanner.next();

        // Validar la longitud mínima de la contraseña
        int longitudMinima = 8; // Longitud mínima requerida
        if (contrasenia.length() < longitudMinima) {
            System.out.println("La contraseña debe tener al menos " + longitudMinima + " caracteres.");
            return; // Salir del método si la contraseña no cumple con la longitud mínima
        }

        // Solicitar al usuario que ingrese la contraseña nuevamente para confirmar
        System.out.println("Ingrese nuevamente la contraseña para confirmar:");
        String confirmacion = scanner.next();

        // Verificar si la confirmación coincide con la contraseña original
        if (contrasenia.equals(confirmacion)) {
            System.out.println("La contraseña ha sido establecida correctamente.");
        } else {
            System.out.println("La confirmación de la contraseña no coincide. Inténtelo de nuevo.");
        }
    }
}