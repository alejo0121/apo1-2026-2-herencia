package model;
public abstract class Animal {
    private String id;
    private String nombre;
    private int edadMeses;

    public Animal(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.edadMeses = 1;
    }

    public int getEdadMeses() {
        return edadMeses;
    }

    public void setEdadMeses(int edadMeses) {
        this.edadMeses = edadMeses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void emitirSonido();

    @Override
    public String toString() {
        return "Animal [id=" + id + ", nombre=" + nombre + "]";
    }

}