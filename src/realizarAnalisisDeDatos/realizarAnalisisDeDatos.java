package realizarAnalisisDeDatos;

import java.util.Scanner;

import static realizarAnalisisDeDatos.calcularNumeroPromedio.calcularPromedio;
import static realizarAnalisisDeDatos.contarNumerosPares.contarNumPares;
import static realizarAnalisisDeDatos.encontrarNumeroMaximo.encontrarMaximo;
import static realizarAnalisisDeDatos.encontrarNumeroMinimo.encontrarMinimo;

public class realizarAnalisisDeDatos {
    public static void realizarAnalisisDatos(Scanner scanner) {
        // Solicitar al usuario la cantidad de números a ingresar
        System.out.print("Ingrese la cantidad de números que desea analizar: ");
        int cantidadNumeros = scanner.nextInt();

        // Crear un arreglo para almacenar los números
        double[] numeros = new double[cantidadNumeros];

        // Solicitar al usuario que ingrese los números uno por uno
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Realizar el análisis de datos
        double maximo = encontrarMaximo(numeros);
        double minimo = encontrarMinimo(numeros);
        double promedio = calcularPromedio(numeros);
        int cantidadPares = contarNumPares(numeros);

        // Mostrar los resultados del análisis de datos
        System.out.println("\nResultados del Análisis de Datos:");
        System.out.println("Número Máximo: " + maximo);
        System.out.println("Número Mínimo: " + minimo);
        System.out.println("Promedio: " + promedio);
        System.out.println("Cantidad de Números Pares: " + cantidadPares);
    }
}