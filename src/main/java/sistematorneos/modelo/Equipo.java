package sistematorneos.modelo;

import java.util.ArrayList;
import sistematorneos.util.Mostrable;

public class Equipo implements Mostrable {

    private int id;
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void mostrarJugadores() {

        System.out.println("Equipo: " + nombre);

        for (Jugador j : jugadores) {
            j.mostrarInformacion();
            System.out.println("-------------------");
        }

    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Equipo: " + nombre);
    }
}