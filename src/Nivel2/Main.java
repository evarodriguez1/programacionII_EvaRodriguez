package Nivel2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Nivel 2 ===");

        System.out.println("Ejercicio 6: ");
        int numero1 = 7;
        System.out.println("¿" + numero1 + " es par? " + Ejercicio6.esPar(numero1));

        System.out.println("Ejercicio 7:");
        int numero2 = 3;
        System.out.println("El cuadrado de " + numero2 + " es: " +
                Ejercicio7.calcularCuadrado(numero2));

        System.out.println("Ejercicio 8: ");
        int numero3 = 5;
        System.out.println("El factorial de " + numero3 + " es: " +
                Ejercicio8.factorial(numero3));
    }
}
