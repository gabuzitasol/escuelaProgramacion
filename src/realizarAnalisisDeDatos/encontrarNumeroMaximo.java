package realizarAnalisisDeDatos;

public class encontrarNumeroMaximo {
    public static double encontrarMaximo(double[] numeros) {
        double maximo = numeros[0];
        for (double numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        return maximo;
    }
}