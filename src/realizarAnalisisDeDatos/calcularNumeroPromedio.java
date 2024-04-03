package realizarAnalisisDeDatos;

public class calcularNumeroPromedio {
    public static double calcularPromedio(double[] numeros) {
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }
}