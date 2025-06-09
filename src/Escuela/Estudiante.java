package Escuela;

public class Estudiante extends Persona {
    // Atributos propios (privados)
    private String matricula;
    private String carrera;
    private double promedio;

    // Constructor con super()
    public Estudiante(String nombre, String apellido,int edad,String dni, String matricula, String carrera, double promedio) {
        super(nombre, apellido, edad, dni); // Llama al constructor de Escuela.Persona
        this.matricula = matricula;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // Getters
    public String getMatricula() {
        return matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    // Setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // Método estudiar()
    public void estudiar() {
        System.out.println(" El estudiante " + getNombre() + " " + getApellido() + " está estudiando " + carrera + ".");
    }

    // Override mostrarInformacion()
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Muestra lo de Escuela.Persona
        System.out.println("Matricula: " + matricula);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
    }
}
