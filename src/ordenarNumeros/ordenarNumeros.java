package ordenarNumeros;

import java.util.Scanner;

public class ordenarNumeros {
    public static void ordenaNumeros(Scanner scanner) {
        // Solicitar al usuario ingresar tres números
        System.out.println("Ingrese el primer número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer número:");
        double numero3 = scanner.nextDouble();

        // Ordenar los números utilizando sentencias if-else
        double menor, medio, mayor;
        if (numero1 <= numero2 && numero1 <= numero3) {
            menor = numero1;
            if (numero2 <= numero3) {
                medio = numero2;
                mayor = numero3;
            } else {
                medio = numero3;
                mayor = numero2;
            }
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            menor = numero2;
            if (numero1 <= numero3) {
                medio = numero1;
                mayor = numero3;
            } else {
                medio = numero3;
                mayor = numero1;
            }
        } else {
            menor = numero3;
            if (numero1 <= numero2) {
                medio = numero1;
                mayor = numero2;
            } else {
                medio = numero2;
                mayor = numero1;
            }
        }

        // Mostrar los números ordenados en orden ascendente
        System.out.println("Los números ordenados en orden ascendente son:");
        System.out.println(menor + ", " + medio + ", " + mayor);
    }
}
