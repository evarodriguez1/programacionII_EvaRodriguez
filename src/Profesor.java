public class Profesor extends Persona {
    private String departamento;
    private  double salario;
    private int añosExperiencia;

    //constructor con super()
    public Profesor(String nombre, String apellido, int edad, String dni, String departamento,double salario,int añosExperiencia){
        super(nombre,apellido,edad,dni);
        this.departamento = departamento;
        this.salario = salario;
        this.añosExperiencia = añosExperiencia;
    }

    // Getters
    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    // Setters
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setSalario(double salario) {
        if (salario > 0) this.salario = salario;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        if (añosExperiencia >= 0) this.añosExperiencia = añosExperiencia;
    }

    // Método enseñar()
    public void enseñar() {
        System.out.println("El profesor " + getNombre() + " " + getApellido() + " está enseñando en el departamento de " + departamento + ".");
    }

    // Sobrescribimos mostrarInformacion()
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario: $" + salario);
        System.out.println("Años de experiencia: " + añosExperiencia);
    }
}
