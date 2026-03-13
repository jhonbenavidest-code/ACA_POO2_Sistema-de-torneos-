package sistematorneos.modelo;

/*
 * Clase: Persona
 * ---------------------------------------------------------
 * Esta clase representa una persona dentro del sistema.
 * 
 * Es una clase abstracta, lo que significa que no se puede
 * crear directamente un objeto de tipo Persona. En su lugar,
 * sirve como clase base para otras clases que representen
 * tipos específicos de personas, como por ejemplo Jugador.
 * 
 * Contiene los atributos comunes que tendrán todas las
 * personas del sistema, como el id y el nombre.
 */

public abstract class Persona {

    // Identificador único de la persona
    protected int id;

    // Nombre de la persona
    protected String nombre;

    /*
     * Constructor de la clase Persona.
     * Inicializa los atributos id y nombre.
     */
    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Método que retorna el id de la persona
    public int getId() {
        return id;
    }

    // Método que retorna el nombre de la persona
    public String getNombre() {
        return nombre;
    }

    /*
     * Método abstracto que debe ser implementado por
     * las clases que hereden de Persona.
     * 
     * Este método se utiliza para mostrar la información
     * específica de cada tipo de persona.
     */
    public abstract void mostrarInformacion();

}