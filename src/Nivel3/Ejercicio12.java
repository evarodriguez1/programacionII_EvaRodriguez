package Nivel3;

public class Ejercicio12 {
    public static int contarOcurrencias(String[] palabras, String clave){
        int contador = 0;
        for (String palabra : palabras){
            if (palabra.equals(clave)){
                contador++;
            }
        }
        return contador;
    }
}
