package tarea8_rodrigovasquez;

import java.awt.Color;
import java.util.ArrayList;

public class Bus extends Transporte {
   private ArrayList<Alumno> alumnos = new ArrayList();
   private int sillas, capPie;

    public Bus() {
    }

    public Bus(int sillas, int capPie, String placa, Color color, Transportista transportista) {
        super(placa, color, transportista);
        this.sillas = sillas;
        this.capPie = capPie;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    public int getCapPie() {
        return capPie;
    }

    public void setCapPie(int capPie) {
        this.capPie = capPie;
    }

    @Override
    public String toString() {
        return "Bus{" + "alumnos=" + alumnos + ", sillas=" + sillas + ", capPie=" + capPie + '}';
    }
   
   
   
}
