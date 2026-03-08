package sistematorneos.modelo;

import sistematorneos.util.Mostrable;

public class Partido implements Mostrable {

    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;

    // Constructor
    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = 0;
        this.golesEquipo2 = 0;
    }

    // Registrar goles
    public void registrarResultado(int goles1, int goles2) {
        this.golesEquipo1 = goles1;
        this.golesEquipo2 = goles2;
    }

    // Mostrar resultado del partido
   @Override
public void mostrarInformacion() {
    System.out.println("Partido:");
    System.out.println(equipo1.getNombre() + " vs " + equipo2.getNombre());
    System.out.println("Resultado: " + golesEquipo1 + " - " + golesEquipo2);
}
    }

