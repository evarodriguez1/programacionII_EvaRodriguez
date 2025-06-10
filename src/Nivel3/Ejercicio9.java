package Nivel3;

public class Ejercicio9 {
    //int... (varargs, significa varios argumentos)
    public static int sumarNumeros(int ... numeros){
        int suma = 0;
        for (int numero : numeros){
            suma += numero;
        }
        return suma;
    }
}
