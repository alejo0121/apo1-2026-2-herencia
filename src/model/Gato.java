package model;

import java.io.Serializable;

public class Gato extends Animal implements Adoptable, Serializable, Cloneable {
    private String raza;

    public Gato(String id, String nombre, String raza) {
        super(id, nombre);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @Override
    public void emitirSonido() {
        System.out.println("Miau");
    }

    @Override
    public String toString() {
        return "Gato [raza=" + raza + ", id=" + getId() + ", nombre=" + getNombre() + "]";
    }

    public boolean cumpleConEsquemaVacunación(){
        return true;
    } 

    public int calcularEdadMinimaMeses(){
        return 6;
    }
    
    public boolean esApto(){
        return cumpleConEsquemaVacunación() && this.getEdadMeses() >= calcularEdadMinimaMeses();
    }
}
