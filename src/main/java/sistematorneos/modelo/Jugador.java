package sistematorneos.modelo;

public class Jugador extends Persona {

    private int edad;

    public Jugador(int id, String nombre, int edad) {
        super(id, nombre);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

    }

}