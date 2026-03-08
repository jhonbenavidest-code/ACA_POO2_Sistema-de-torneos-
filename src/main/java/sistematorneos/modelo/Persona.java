package sistematorneos.modelo;

public abstract class Persona {

    protected int id;
    protected String nombre;

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    // método abstracto
    public abstract void mostrarInformacion();

}
