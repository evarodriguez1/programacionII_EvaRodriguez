package Nivel4;

public class Ejercicio14 {
    public static int[] invertirArray(int[] numeros) {
        int[] invertido = new int[numeros.length];//ccrea un array del mismo tamaño
        for (int i = 0; i < numeros.length; i++) {
            invertido[i] = numeros[numeros.length - 1 - i];
        }
        return invertido;
    }
}
