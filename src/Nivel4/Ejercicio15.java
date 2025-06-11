package Nivel4;

public class Ejercicio15 {
    public static String mejorEstudiante(String[] nombres, int[] notas) {
        //verifica que no estén vacíos y que tengan la misma cant de elementos
        if (nombres.length == 0 || nombres.length != notas.length) {
            return "Datos inválidos";
        }

        int mejorNota = notas[0];
        String mejorEstudiante = nombres[0];

        //recorre desde el segundo estudiante
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mejorNota) {
                mejorNota = notas[i];
                mejorEstudiante = nombres[i];
            }
        }

        return mejorEstudiante;
    }
}
