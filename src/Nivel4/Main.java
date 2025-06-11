package Nivel4;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== NIVEL 4 ===");

        System.out.println("Ejercicio 13: ");
        int[] arrayPrueba = {5, 10, 15, 20};
        System.out.print("Array formateado: ");
        Ejercicio13.imprimirArray(arrayPrueba);

        System.out.println("Ejercicio 14: ");
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.print("Original: ");
        Ejercicio13.imprimirArray(numeros);

        int[] invertido = Ejercicio14.invertirArray(numeros);
        System.out.print("Invertido: ");
        Ejercicio13.imprimirArray(invertido);

        System.out.println("Ejercicio 15: ");
        String[] nombres = {"Batistuta", "Pedro", "Jose", "Ambar"};
        int[] notas = {2, 9, 8, 10};
        String mejor = Ejercicio15.mejorEstudiante(nombres, notas);
        System.out.println("Mejor estudiante: " + mejor);
    }
}
