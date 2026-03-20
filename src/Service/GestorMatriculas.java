package Service;

import Model.Alumno;
import Model.Profesor;

import java.util.ArrayList;

/**
 * Esta clase sirve para crear las matriculas y mostrar su información, como los alumnos que estan aprobados,
 * la media de todos los alumnos y un metodo para que puedan subir la nota
 */
public class GestorMatriculas implements Informacion {

    private ArrayList<Matricula> matriculas;

    public GestorMatriculas() {
        matriculas = new ArrayList<>();
    }

    public void crearMatricula(Alumno a, Clase.Asignatura as, Profesor p, double nota) {

        if (nota < 0) {
            nota = 0;
        }

        Matricula m = new Matricula(a, as, p, nota);

        matriculas.add(m);

        a.matricular(m);
    }

    @Override
    public void mostrarInformacion() {
        for (Matricula m : matriculas) {
            System.out.println(
                m.getAlumno().getNombre() + " - " +
                        m.getAsignatura().getNombre() + " - " +
                        m.getProfesor().getNombre() + " - " +
                        m.getNota()
            );
        }
    }

    public void mostrarAprobados() {
        for (Matricula m : matriculas) {
            if (m.getNota() >= 5) {
                System.out.println("APROBADO: " + m.getAlumno().getNombre());
            }
        }
    }

    public void subirNotaTodos(double puntos) {
        for (Matricula m : matriculas) {
            m.setNota(m.getNota() + puntos);

            if (m.getNota() > 10) {
                m.setNota(10);
            }
        }
    }

    public double mediaGlobal() {
        double suma = 0;

        for (Matricula m : matriculas) {
            suma += m.getNota();
        }

        if (matriculas.isEmpty()) return 0;

        return suma / matriculas.size();
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
