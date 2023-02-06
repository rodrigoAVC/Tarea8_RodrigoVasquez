package tarea8_rodrigovasquez;

import java.awt.Color;
import java.util.ArrayList;

public class Rapidito extends Transporte {
    private int sillas;
    private ArrayList<Alumno> alumnos = new ArrayList();

    public Rapidito() {
    }

    public Rapidito(int sillas, String placa, Color color, Transportista transportista) {
        super(placa, color, transportista);
        this.sillas = sillas;
    }

    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Rapidito{" + "sillas=" + sillas + ", alumnos=" + alumnos + '}';
    }
    
    
}
