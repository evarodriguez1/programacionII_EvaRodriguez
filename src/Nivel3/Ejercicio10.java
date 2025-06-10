package Nivel3;

public class Ejercicio10 {
    public static double PromedioArray(double[]numeros){
        double suma = 0;
        for (double numero : numeros){
            suma += numero;
        }
        return suma / numeros.length;
    }
}
