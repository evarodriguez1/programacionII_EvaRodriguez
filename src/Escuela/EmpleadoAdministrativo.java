package Escuela;

public class EmpleadoAdministrativo extends Persona {
    private String cargo;
    private String horarioTrabajo;
    private double salario;

    public EmpleadoAdministrativo(String nombre, String apellido, int edad, String dni, String cargo, String horarioTrabajo, double salario) {
        super(nombre, apellido, edad, dni);
        this.cargo = cargo;
        this.horarioTrabajo = horarioTrabajo;
        this.salario = salario;
    }

    // Getters
    public String getCargo() {
        return cargo;
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public double getSalario() {
        return salario;
    }

    // Setters
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }

    public void setSalario(double salario) {
        if (salario > 0) this.salario = salario;
    }

    // Método administrar()
    public void administrar() {
        System.out.println("El empleado " + getNombre() + " " + getApellido() + " está realizando tareas administrativas.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cargo: " + cargo);
        System.out.println("Horario de trabajo: " + horarioTrabajo);
        System.out.println("Salario: $" + salario);
    }
}
