public class Persona {
    //Atributos Privados (encapsulamiento)
    private String nombre;
    private String apellido;
    private int edad;
    private String dni; //String para escalarlo a passport

    //Constructor con parámetros
    public Persona(String nombre,String apellido, int edad, String dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    //Métodos getters y settes
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    // Método para mostrar los datos
    // Se sobreescribe el método ToString -> que viene de la clase Object
    @Override
    public String toString() {
        return "---- DATOS DE LA PERSONA ----\n" +
                "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Edad: " + edad + "\n" +
                "DNI: " + dni + "\n";
    }

    //metodo mostrarInformacion() con el toString adentro
    public void mostrarInformacion() {
        System.out.println(this.toString());
    }
}
