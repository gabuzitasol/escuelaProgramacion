import java.util.Scanner;
import calculadoraIMC.menuCalculadoraIMC;
import conversorDeMonedas.menuConversorDeMonedas;
import ordenarNumeros.menuOrdenarNumeros;
import validacionContrasenia.menuValidacionContrasenia;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Calculadora de IMC");
            System.out.println("2. Conversor de Monedas");
            System.out.println("3. Validación de Contraseña");
            System.out.println("4. Ordenar Números");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    menuCalculadoraIMC.mostrarMenu(scanner);
                    break;
                case 2:
                    menuConversorDeMonedas.mostrarMenu(scanner);
                    break;
                case 3:
                    menuValidacionContrasenia.mostrarMenu(scanner);
                    break;
                case 4:
                    menuOrdenarNumeros.mostrarMenu(scanner);
                case 5:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
            }
        }
        scanner.close();
    }
}