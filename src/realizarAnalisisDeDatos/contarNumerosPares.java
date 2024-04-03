package realizarAnalisisDeDatos;

public class contarNumerosPares {
    public static int contarNumPares(double[] numeros) {
        int cantidadPares = 0;
        for (double numero : numeros) {
            if (numero % 2 == 0) {
                cantidadPares++;
            }
        }
        return cantidadPares;
    }
}