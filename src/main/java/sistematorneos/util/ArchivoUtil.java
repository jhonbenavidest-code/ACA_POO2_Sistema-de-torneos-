package sistematorneos.util;

import java.io.FileWriter;
import java.io.IOException;
import sistematorneos.modelo.Equipo;
import java.util.ArrayList;

public class ArchivoUtil {

    public static void guardarEquipos(ArrayList<Equipo> equipos) {

        try {

            FileWriter writer = new FileWriter("equipos.txt");

            for (Equipo e : equipos) {
                writer.write(e.getId() + "," + e.getNombre() + "\n");
            }

            writer.close();

            System.out.println("Equipos guardados en archivo.");

        } catch (IOException e) {

            System.out.println("Error al guardar archivo.");

        }

    }

}