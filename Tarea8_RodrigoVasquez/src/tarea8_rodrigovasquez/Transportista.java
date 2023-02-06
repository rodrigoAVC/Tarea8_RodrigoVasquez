package tarea8_rodrigovasquez;

import java.util.Date;


public class Transportista extends Persona{
    private int exp;
    private String apodo;

    public Transportista() {
    }

    public Transportista(int exp, String apodo, String nombre, int id, Date bDay) {
        super(nombre, id, bDay);
        this.exp = exp;
        this.apodo = apodo;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "Transportista{" + "exp=" + exp + ", apodo=" + apodo + '}';
    }
    
    
}
