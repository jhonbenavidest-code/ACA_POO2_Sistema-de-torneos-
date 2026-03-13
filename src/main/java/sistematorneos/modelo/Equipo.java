package sistematorneos.modelo;

import java.util.ArrayList;
import sistematorneos.util.Mostrable;

/*
 * Clase: Equipo
 * ---------------------------------------------------------
 * Esta clase representa un equipo dentro del sistema de torneos.
 * Cada equipo tiene un identificador, un nombre y una lista de
 * jugadores que pertenecen a ese equipo.
 * 
 * La clase implementa la interfaz Mostrable para poder mostrar
 * su información en la consola.
 */

public class Equipo implements Mostrable {

    // Identificador único del equipo
    private int id;

    // Nombre del equipo
    private String nombre;

    // Lista que almacena los jugadores que pertenecen al equipo
    private ArrayList<Jugador> jugadores;

    /*
     * Constructor de la clase Equipo.
     * Inicializa el id, el nombre del equipo y crea una lista vacía
     * para almacenar los jugadores.
     */
    public Equipo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    // Método que retorna el id del equipo
    public int getId() {
        return id;
    }

    // Método que retorna el nombre del equipo
    public String getNombre() {
        return nombre;
    }

    /*
     * Método que permite agregar un jugador a la lista de jugadores
     * del equipo.
     */
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    /*
     * Método que muestra todos los jugadores que pertenecen
     * al equipo recorriendo la lista de jugadores.
     */
    public void mostrarJugadores() {

        System.out.println("Equipo: " + nombre);

        // Se recorre la lista de jugadores para mostrar la información de cada uno
        for (Jugador j : jugadores) {
            j.mostrarInformacion();
            System.out.println("-------------------");
        }

    }

    /*
     * Implementación del método definido en la interfaz Mostrable.
     * Permite mostrar la información básica del equipo.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("Equipo: " + nombre);
    }
}