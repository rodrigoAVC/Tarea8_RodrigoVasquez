package tarea8_rodrigovasquez;

import java.awt.Color;
import java.util.ArrayList;

public class Transporte {
    private String placa;
    private Color color;
    private Transportista transportista;
    private ArrayList<Estacion> estaciones = new ArrayList();

    public Transporte() {
    }

    public Transporte(String placa, Color color, Transportista transportista) {
        this.placa = placa;
        this.color = color;
        this.transportista = transportista;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Transportista getTransportista() {
        return transportista;
    }

    public void setTransportista(Transportista transportista) {
        this.transportista = transportista;
    }

    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(ArrayList<Estacion> estaciones) {
        this.estaciones = estaciones;
    }

    @Override
    public String toString() {
        return "Transporte{" + "placa=" + placa + ", color=" + color + ", transportista=" + transportista + ", estaciones=" + estaciones + '}';
    }
    
    
    
}
