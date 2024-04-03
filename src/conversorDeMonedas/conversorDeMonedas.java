package conversorDeMonedas;

import java.util.Scanner;

public class conversorDeMonedas {
    public static void convertirPesosADolares(Scanner scanner) {
        // Solicitar al usuario que ingrese la cantidad en pesos argentinos
        System.out.println("Ingrese la cantidad en pesos argentinos:");
        double pesos = scanner.nextDouble();

        // Definir la tasa de conversión
        double tasaConversion = 0.012; // 1 peso argentino = 0.012 dólares

        // Calcular la cantidad en dólares
        double dolares = pesos * tasaConversion;

        // Mostrar el resultado de la conversión
        System.out.println("La cantidad en dólares es: " + dolares);
    }
}