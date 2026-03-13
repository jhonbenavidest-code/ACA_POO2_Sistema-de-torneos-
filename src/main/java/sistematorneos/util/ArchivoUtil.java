package sistematorneos.util;

import java.io.FileWriter;
import java.io.IOException;
import sistematorneos.modelo.Equipo;
import java.util.ArrayList;

/*
 * Clase: ArchivoUtil
 * ---------------------------------------------------------
 * Esta clase utilitaria se encarga del manejo de archivos
 * dentro del sistema de torneos.
 * 
 * Actualmente permite guardar la información de los equipos
 * registrados en un archivo de texto.
 * 
 * Se utiliza para almacenar los datos del sistema antes de
 * cerrar el programa.
 */

public class ArchivoUtil {

    /*
     * Método que guarda la lista de equipos en un archivo de texto.
     * 
     * Cada equipo se guarda en una línea del archivo con el formato:
     * id,nombre
     */
    public static void guardarEquipos(ArrayList<Equipo> equipos) {

        try {

            // Se crea el archivo equipos.txt donde se guardará la información
            FileWriter writer = new FileWriter("equipos.txt");

            // Se recorre la lista de equipos para escribirlos en el archivo
            for (Equipo e : equipos) {
                writer.write(e.getId() + "," + e.getNombre() + "\n");
            }

            // Se cierra el archivo para guardar los cambios
            writer.close();

            System.out.println("Equipos guardados en archivo.");

        } catch (IOException e) {

            // Mensaje de error en caso de que ocurra un problema al guardar
            System.out.println("Error al guardar archivo.");

        }

    }

}