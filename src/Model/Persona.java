package Model;

/**
 * Esta es una clase padre que sirve para que las clases hijas usen el metodo
 * y el atributo que se encuentras aqui
 */
public class Persona {
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarDatos() {
        System.out.println("Persona: " + nombre);
    }
}
