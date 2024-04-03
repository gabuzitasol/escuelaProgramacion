package calculadora;
import java.util.Scanner;

public class menuCalculadoraIMC {
    public static void menuCalcularIMC() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("1. Calcular IMC");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calculadoraIMC.calcularIMC(scanner);
                    break;
                case 2:
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
