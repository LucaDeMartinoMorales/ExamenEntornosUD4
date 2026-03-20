package Model;

import Service.Matricula;
import java.util.ArrayList;

public class Alumno extends Persona {

    private int edad;
    private ArrayList<Matricula> matriculas;

    public Alumno(String nombre, int edad) {
        super(nombre);
        this.edad = edad;
        this.matriculas = new ArrayList<>();
    }

    public void matricular(Matricula m) {
        matriculas.add(m);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Model.Alumno: " + nombre);

        for (Matricula m : matriculas) {
            System.out.println("Asignatura: " + m.getAsignatura().getNombre() +
                    " Profesor: " + m.getProfesor().getNombre() +
                    " Nota: " + m.getNota());
        }
    }

    public double calcularMedia() {
        double suma = 0;

        for (Matricula m : matriculas) {
            suma += m.getNota();
        }

        if (matriculas.size() == 0) return 0;

        return suma / matriculas.size();
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

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
