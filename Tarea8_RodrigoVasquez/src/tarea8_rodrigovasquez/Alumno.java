package tarea8_rodrigovasquez;

import java.util.ArrayList;
import java.util.Date;

public class Alumno extends Persona {
    private int studentId;
    private ArrayList<Clase> clases = new ArrayList();

    public Alumno() {
    }

    public Alumno(int studentId, String nombre, int id, Date bDay) {
        super(nombre, id, bDay);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Alumno[" + "ID de Estudiante:" + studentId + ", Clases: " + clases + ']';
    }
    
    
    
}
