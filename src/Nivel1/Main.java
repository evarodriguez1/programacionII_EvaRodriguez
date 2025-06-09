package Nivel1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Probando ejercicios del Nivel 1:");

        System.out.print("Ejercicio 1: ");
        Ejercicio1.mostrarSaludo();

        System.out.print("Ejercicio 2: ");
        Ejercicio2.saludar("Cacho");

        System.out.print("Ejercicio 3: ");
        double area =  Ejercicio3.CalcularAreaRectangulo(2.71, 3.28);
        System.out.println("Áres del rectángulo: " + area);

        System.out.print("Ejercicio 4: ");
        String texto = "cacho querido!";
        String mayusculas = Ejercicio4.convertirAMayuscula(texto);
        System.out.println("Texto convertido a Mayúscula: " + mayusculas);

        System.out.println("Ejercicio 5: ");
        Ejercicio5.mostrarMenu();
    }
}
