package sistematorneos.servicio;

import sistematorneos.modelo.Equipo;
import sistematorneos.modelo.Jugador;
import sistematorneos.modelo.Partido;
import java.util.ArrayList;

public class TorneoServicio {

    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> partidos;

    public TorneoServicio() {
        equipos = new ArrayList<>();
        partidos = new ArrayList<>();
    }

    public void registrarEquipo(Equipo equipo) {
        equipos.add(equipo);
        System.out.println("Equipo registrado correctamente.");
    }

    public void registrarJugadorEquipo(Equipo equipo, Jugador jugador) {
        equipo.agregarJugador(jugador);
        System.out.println("Jugador agregado al equipo.");
    }

    public void crearPartido(Equipo e1, Equipo e2, int goles1, int goles2) {

        Partido partido = new Partido(e1, e2);

        partido.registrarResultado(goles1, goles2);

        partidos.add(partido);
    }

    public void mostrarEquipos() {

    for (int i = 0; i < equipos.size(); i++) {

        System.out.println(i + " - " + equipos.get(i).getNombre());

        }
    }
    
    public Equipo buscarEquipoPorId(int id) {

    for (Equipo e : equipos) {

        if (e.getId() == id) {
            return e;
        }

    }

    return null;
}

    public void mostrarPartidos() {
        for (Partido p : partidos) {
            p.mostrarInformacion();
        }
    }
    public ArrayList<Equipo> getEquipos() {
    return equipos;
    
    
}
    public void guardarDatos() {
    sistematorneos.util.ArchivoUtil.guardarEquipos(equipos);
}
}
