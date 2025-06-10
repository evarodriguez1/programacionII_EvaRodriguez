package Nivel3;

public class Ejercicio11 {
    public static boolean numeroEstaPresente(int [] numeros, int numeroABuscar){
       for (int numero : numeros){
           if (numero == numeroABuscar){
               return true;
           }
       }
       return false;
    }
}
