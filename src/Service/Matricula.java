package Service;

import Clase.Asignatura;
import Model.Alumno;
import Model.Profesor;

public class Matricula implements Informacion {

    private Alumno alumno;
    private Asignatura asignatura;
    private Profesor profesor;
    private double nota;

    public Matricula(Alumno alumno, Asignatura asignatura, Profesor profesor, double nota) {
        this.alumno = alumno;
        this.asignatura = asignatura;
        this.profesor = profesor;
        this.nota = nota;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(alumno.getNombre() + " - " +
                asignatura.getNombre() + " - " +
                profesor.getNombre() + " - Nota: " + nota);
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public double getNota() {
        return nota;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
