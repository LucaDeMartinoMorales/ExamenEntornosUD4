package Model;

public class Persona {
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarDatos() {
        System.out.println("Persona: " + nombre);
    }
}
