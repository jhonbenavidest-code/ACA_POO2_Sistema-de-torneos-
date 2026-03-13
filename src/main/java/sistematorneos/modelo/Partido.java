package sistematorneos.modelo;

import sistematorneos.util.Mostrable;

/*
 * Clase: Partido
 * ---------------------------------------------------------
 * Esta clase representa un partido dentro del sistema de torneos.
 * 
 * Un partido se juega entre dos equipos y almacena el resultado
 * en forma de goles anotados por cada equipo.
 * 
 * La clase implementa la interfaz Mostrable para poder mostrar
 * la información del partido en consola.
 */

public class Partido implements Mostrable {

    // Primer equipo que participa en el partido
    private Equipo equipo1;

    // Segundo equipo que participa en el partido
    private Equipo equipo2;

    // Cantidad de goles anotados por el primer equipo
    private int golesEquipo1;

    // Cantidad de goles anotados por el segundo equipo
    private int golesEquipo2;

    /*
     * Constructor de la clase Partido.
     * 
     * Recibe los dos equipos que jugarán el partido.
     * Inicialmente los goles se establecen en 0.
     */
    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = 0;
        this.golesEquipo2 = 0;
    }

    /*
     * Método que permite registrar el resultado del partido.
     * Recibe la cantidad de goles anotados por cada equipo.
     */
    public void registrarResultado(int goles1, int goles2) {
        this.golesEquipo1 = goles1;
        this.golesEquipo2 = goles2;
    }

    /*
     * Implementación del método definido en la interfaz Mostrable.
     * Muestra en consola los equipos que jugaron el partido y el
     * resultado final del encuentro.
     */
    @Override
    public void mostrarInformacion() {

        System.out.println("Partido:");
        System.out.println(equipo1.getNombre() + " vs " + equipo2.getNombre());
        System.out.println("Resultado: " + golesEquipo1 + " - " + golesEquipo2);

    }
}

