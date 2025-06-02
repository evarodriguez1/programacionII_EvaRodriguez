import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("----- DATOS DE PERSONA -----");
        //Se crea el objeto persona,
        Persona persona1 = new Persona("Pepe","Ruiseñor",26, "34527165");

        //Se muestran los datos con toString()
        System.out.println(persona1);

        //Se cambia un dato
        persona1.setNombre("José María");

        //Mostramos nuevamente el resultado
        System.out.println(persona1);

        System.out.println("----- DATOS DE ESTUDIANTE -----");
        //Se crea un objeto estudiante
        Estudiante estudiante1 = new Estudiante(
                "Estivalet",
                "Quesada",
                26,
                "404675234",
                "678765",
                "Desarrollo en Software",
                9.2
        );

        //Se muestra toda la info
        estudiante1.mostrarInformacion();

        //Se llama al método estudiar()
        estudiante1.estudiar();

        System.out.println("----- DATOS DE PROFESOR -----");
        //Se crea un objeto profesor
        Profesor profesor1 = new Profesor(
                "Ramon",
                "Ochoa",
                54,
                "20567890",
                "Ingeniería Química",
                1123475.56,
                25
        );

        //Se muestra la info de profesor
        profesor1.mostrarInformacion();

        //Se llama al método enseñar()
        profesor1.enseñar();

        System.out.println("----- DATOS DE EMPLEADO ADMINISTRATIVO-----");

        EmpleadoAdministrativo administrativo1 = new EmpleadoAdministrativo(
                "Pedro",
                "Almodovar",
                35,
                "33456214",
                "Secretario Turno Mañana",
                "8:00 a 14:00",
                900100.67
        );

        //se muestra la info del administrativo
        administrativo1.mostrarInformacion();

        //Se llama al método admiistar()
        administrativo1.administrar();

        System.out.println("\n POLIMORFISMO:");
        // ArrayList de tipo Persona
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(estudiante1);
        personas.add(profesor1);
        personas.add(administrativo1);

        for (Persona p : personas) {
            p.mostrarInformacion(); // Se llama al método correcto según el objeto real
            System.out.println("----------------------");
        }
    }
}