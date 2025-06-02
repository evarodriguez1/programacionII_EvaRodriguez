//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Se crea el objeto
        Persona persona1 = new Persona("Pepe","Ruiseñor",26, "34527165");

        //Se muestran los datos con toString()
        System.out.println(persona1);

        //Se cambia un dato
        persona1.setNombre("José María");

        //Mostramos nuevamente el resultado
        System.out.println(persona1);

        //Se crea un estudiante
        Estudiante estudiante1 = new Estudiante(
                "Estivalet",
                "Quesada",
                26,
                "404675234",
                "678765",
                "Desarrollo en Software",
                9.2
        );

        //Mostramos toda la info
        estudiante1.mostrarInformacion();

        //Llamamos al método estudiar
        estudiante1.estudiar();

    }
}