public class Perro extends Animal{

    public Perro(String id, String nombre) {
       super(id, nombre);
    }

    @Override 
    public void emitirSonido(){
        System.out.println("Guau");
    }

    @Override
    public String toString() {
        return "Perro [id=" + getId() + ", nombre=" + getNombre() + "]";
    }
    
}
