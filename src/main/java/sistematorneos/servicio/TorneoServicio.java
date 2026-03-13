package sistematorneos.servicio;

import sistematorneos.modelo.Equipo;
import sistematorneos.modelo.Jugador;
import sistematorneos.modelo.Partido;
import java.util.ArrayList;

/*
 * Clase: TorneoServicio
 * ---------------------------------------------------------
 * Esta clase contiene la lógica principal del sistema de torneos.
 * 
 * Se encarga de administrar los equipos y los partidos registrados
 * en el sistema. Aquí se realizan operaciones como:
 * 
 * - Registrar equipos
 * - Agregar jugadores a un equipo
 * - Crear partidos entre equipos
 * - Mostrar equipos registrados
 * - Mostrar partidos jugados
 * 
 * Utiliza listas (ArrayList) para almacenar los equipos y los partidos.
 */

public class TorneoServicio {

    // Lista que almacena todos los equipos registrados en el torneo
    private ArrayList<Equipo> equipos;

    // Lista que almacena todos los partidos creados en el torneo
    private ArrayList<Partido> partidos;

    /*
     * Constructor de la clase TorneoServicio.
     * Inicializa las listas de equipos y partidos vacías.
     */
    public TorneoServicio() {
        equipos = new ArrayList<>();
        partidos = new ArrayList<>();
    }

    /*
     * Método que permite registrar un nuevo equipo en el sistema.
     * El equipo se agrega a la lista de equipos del torneo.
     */
    public void registrarEquipo(Equipo equipo) {
        equipos.add(equipo);
        System.out.println("Equipo registrado correctamente.");
    }

    /*
     * Método que permite agregar un jugador a un equipo específico.
     * Utiliza el método agregarJugador de la clase Equipo.
     */
    public void registrarJugadorEquipo(Equipo equipo, Jugador jugador) {
        equipo.agregarJugador(jugador);
        System.out.println("Jugador agregado al equipo.");
    }

    /*
     * Método que crea un nuevo partido entre dos equipos.
     * También registra el resultado del partido (goles).
     */
    public void crearPartido(Equipo e1, Equipo e2, int goles1, int goles2) {

        // Se crea el objeto Partido con los dos equipos
        Partido partido = new Partido(e1, e2);

        // Se registran los goles del partido
        partido.registrarResultado(goles1, goles2);

        // Se guarda el partido en la lista de partidos
        partidos.add(partido);
    }

    /*
     * Método que muestra todos los equipos registrados.
     * Se utiliza un ciclo for para recorrer la lista de equipos.
     */
    public void mostrarEquipos() {

        for (int i = 0; i < equipos.size(); i++) {

            System.out.println(i + " - " + equipos.get(i).getNombre());

        }
    }

    /*
     * Método que busca un equipo por su id.
     * Si encuentra el equipo lo retorna, de lo contrario retorna null.
     */
    public Equipo buscarEquipoPorId(int id) {

        for (Equipo e : equipos) {

            if (e.getId() == id) {
                return e;
            }

        }

        return null;
    }

    /*
     * Método que muestra todos los partidos registrados en el sistema.
     */
    public void mostrarPartidos() {
        for (Partido p : partidos) {
            p.mostrarInformacion();
        }
    }

    /*
     * Método que retorna la lista de equipos registrados.
     * Se utiliza en otras clases para acceder a los equipos del sistema.
     */
    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    /*
     * Método que guarda los datos del sistema utilizando la clase ArchivoUtil.
     * Esto permite almacenar la información de los equipos en un archivo.
     */
    public void guardarDatos() {
        sistematorneos.util.ArchivoUtil.guardarEquipos(equipos);
    }
}
