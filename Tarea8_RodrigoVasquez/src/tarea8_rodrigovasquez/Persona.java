package tarea8_rodrigovasquez;

import java.util.Date;

public class Persona {
    private String nombre;
    private int id;
    private Date bDay;

    public Persona() {
    }

    public Persona(String nombre, int id, Date bDay) {
        this.nombre = nombre;
        this.id = id;
        this.bDay = bDay;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getbDay() {
        return bDay;
    }

    public void setbDay(Date bDay) {
        this.bDay = bDay;
    }

    @Override
    public String toString() {
        return "Persona[" + "Nombre: " + nombre + ", ID: " + id + ", Fecha de Nacimiento: " + bDay + ']';
    }
    
    
}
