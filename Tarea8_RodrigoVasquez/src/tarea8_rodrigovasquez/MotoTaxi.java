package tarea8_rodrigovasquez;

import java.awt.Color;
import java.util.ArrayList;

public class MotoTaxi extends Transporte {
    private ArrayList<Alumno> alumnos = new ArrayList();

    public MotoTaxi() {
    }

    public MotoTaxi(String placa, Color color, Transportista transportista) {
        super(placa, color, transportista);
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "MotoTaxi{" + "alumnos=" + alumnos + '}';
    }
    
    
    
}
