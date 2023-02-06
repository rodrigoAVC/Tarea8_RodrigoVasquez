package tarea8_rodrigovasquez;

import java.awt.Color;
import java.util.ArrayList;

public class Taxi extends Transporte {
    private int numTaxi;
    private ArrayList<Alumno> alumnos = new ArrayList();

    public Taxi() {
    }

    public Taxi(int numTaxi, String placa, Color color, Transportista transportista) {
        super(placa, color, transportista);
        this.numTaxi = numTaxi;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    public int getNumTaxi() {
        return numTaxi;
    }

    public void setNumTaxi(int numTaxi) {
        this.numTaxi = numTaxi;
    }

    @Override
    public String toString() {
        return "Taxi{" + "numTaxi=" + numTaxi + ", alumnos=" + alumnos + '}';
    }

    

}
