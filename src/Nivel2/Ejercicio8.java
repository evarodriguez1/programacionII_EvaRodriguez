package Nivel2;

public class Ejercicio8 {
    public static long factorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Solo se puede con números enteros y positivos");
        }
        if (numero == 0 || numero == 1) {
            return 1;
        }
        return numero * factorial(numero - 1);
    }
}
