package realizarAnalisisDeDatos;

public class encontrarNumeroMinimo {
    public static double encontrarMinimo(double[] numeros) {
        double minimo = numeros[0];
        for (double numero : numeros) {
            if (numero < minimo) {
                minimo = numero;
            }
        }
        return minimo;
    }
}