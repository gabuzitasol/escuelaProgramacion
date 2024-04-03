import calculadora.menuCalculadoraIMC;
import conversorDeMonedas.menuConversorDeMonedas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Conversor de Monedas");
            System.out.println("2. Calculadora de IMC");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    menuConversorDeMonedas.mostrarMenu(scanner);
                    break;
                case 2:
                    menuCalculadoraIMC.mostrarMenu(scanner);
                    break;
                case 3:
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