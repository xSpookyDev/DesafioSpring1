package cl.praxis.primerProyecto.model;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
    }

    public Persona(String apellido, String nombre, int edad) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Edad: " + edad;
    }
}
