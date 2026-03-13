package sistematorneos.modelo;

/*
 * Clase: Jugador
 * ---------------------------------------------------------
 * Esta clase representa a un jugador dentro del sistema de torneos.
 * 
 * La clase Jugador hereda de la clase Persona, por lo que obtiene
 * automáticamente los atributos id y nombre definidos en Persona.
 * 
 * Además agrega el atributo edad para almacenar la edad del jugador.
 */

public class Jugador extends Persona {

    // Edad del jugador
    private int edad;

    /*
     * Constructor de la clase Jugador.
     * 
     * Recibe el id, nombre y edad del jugador. Los atributos id y nombre
     * se inicializan utilizando el constructor de la clase padre (Persona)
     * mediante la palabra clave super.
     */
    public Jugador(int id, String nombre, int edad) {
        super(id, nombre); // Llama al constructor de Persona
        this.edad = edad;
    }

    // Método que retorna la edad del jugador
    public int getEdad() {
        return edad;
    }

    /*
     * Método que muestra la información del jugador en consola.
     * 
     * Este método sobrescribe (override) el método definido en la clase
     * Persona para mostrar también la edad del jugador.
     */
    @Override
    public void mostrarInformacion() {

        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

    }

}