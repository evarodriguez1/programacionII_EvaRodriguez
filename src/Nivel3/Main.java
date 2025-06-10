package Nivel3;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== NIVEL 3 ===");

        System.out.println("Ejercicio 9: ");
        int suma = Ejercicio9.sumarNumeros(5, 10, 15, 20);
        System.out.println("Suma de números: " + suma); // 50

        System.out.println("Ejercicio 10: ");
        double[] notas = {8.5, 7.0, 9.2, 10.0};
        double promedio = Ejercicio10.PromedioArray(notas);
        System.out.println("Promedio: " + promedio); // promedio esperado

        System.out.println("Ejercicio 11:");
        int[] numeros = {5,7,8,9,10};
        int numeroABuscar = 7;
        boolean encontrado = Ejercicio11.numeroEstaPresente(numeros,numeroABuscar);
        System.out.println("El número está presente?: " + encontrado);

        System.out.println("Ejercicio 12:");
        String[] palabras = {"pepe", "batistuta", "paloma", "ramon", "batistuta","batistuta"};
        String clave = "batistuta";
        int contador = Ejercicio12.contarOcurrencias(palabras, clave);
        System.out.println("Cantidad de veces que aparece la clave: " + contador);
    }
}
