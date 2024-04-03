package calculadora;

import java.util.Scanner;
public class calculadoraIMC {
    public static void calcularIMC(Scanner scanner) {
        // Solicitar al usuario que ingrese su peso en kilogramos
        System.out.println("Ingrese su peso en kilogramos:");
        double peso = scanner.nextDouble();

        // Solicitar al usuario que ingrese su altura en metros
        System.out.println("Ingrese su altura en metros:");
        double altura = scanner.nextDouble();

        // Calcular el IMC
        double imc = peso / (altura * altura);

        // Mostrar el resultado del IMC y la categoría de peso
        System.out.println("Su IMC es: " + imc);
        if (imc < 18.5) {
            System.out.println("Usted tiene peso bajo.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Usted tiene un peso normal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Usted tiene sobrepeso.");
        } else {
            System.out.println("Usted tiene obesidad.");
        }
    }
}
