package sistematorneos.main;

import sistematorneos.servicio.TorneoServicio;
import sistematorneos.modelo.Equipo;
import java.util.Scanner;

/*
 * Clase: Sistema_Torneos
 * -------------------------------------------------------
 * Esta es la clase principal del sistema de torneos.
 * Contiene el método main, que es el punto de inicio del programa.
 * 
 * Su función es mostrar un menú en consola que permite al usuario:
 * - Registrar equipos
 * - Crear partidos entre equipos
 * - Mostrar los equipos registrados
 * - Mostrar los partidos jugados
 * 
 * Esta clase interactúa con la clase TorneoServicio, la cual
 * contiene la lógica del sistema.
 */

public class Sistema_Torneos {

    public static void main(String[] args) {

        // Scanner utilizado para leer datos ingresados por el usuario en consola
        Scanner scanner = new Scanner(System.in);

        // Objeto que maneja toda la lógica del torneo (equipos y partidos)
        TorneoServicio torneo = new TorneoServicio();

        // Variable que almacena la opción seleccionada por el usuario en el menú
        int opcion = 0;

        // Ciclo que mantiene el menú activo hasta que el usuario seleccione salir
        do {

            // Menú principal del sistema
            System.out.println("\n===== SISTEMA DE TORNEOS =====");
            System.out.println("1. Registrar equipo");
            System.out.println("2. Crear partido");
            System.out.println("3. Mostrar equipos");
            System.out.println("4. Mostrar partidos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            try {

                // Se lee la opción ingresada por el usuario
                opcion = scanner.nextInt();

            } catch (Exception e) {

                // Manejo de error si el usuario ingresa algo que no es número
                System.out.println("Error: debe ingresar un numero.");
                scanner.nextLine(); // Limpia el buffer del scanner
                opcion = 0;
                continue;

            }

            // Estructura que ejecuta la acción según la opción elegida
            switch (opcion) {

                case 1:

                    // Registro de un nuevo equipo en el sistema

                    System.out.print("Ingrese ID del equipo: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese nombre del equipo: ");
                    String nombre = scanner.nextLine();

                    // Se crea un nuevo objeto Equipo con los datos ingresados
                    Equipo equipo = new Equipo(id, nombre);

                    // Se registra el equipo en el sistema usando TorneoServicio
                    torneo.registrarEquipo(equipo);

                    break;

                case 2:

                    // Creación de un partido entre dos equipos

                    // Verifica que existan al menos 2 equipos registrados
                    if (torneo.getEquipos().size() < 2) {
                        System.out.println("Se necesitan al menos 2 equipos para crear un partido.");
                        break;
                    }

                    // Muestra los equipos disponibles para seleccionar
                    torneo.mostrarEquipos();

                    System.out.print("Seleccione el indice del primer equipo: ");
                    int e1 = scanner.nextInt();

                    System.out.print("Seleccione el indice del segundo equipo: ");
                    int e2 = scanner.nextInt();

                    // Registro de goles de cada equipo
                    System.out.print("Goles del primer equipo: ");
                    int g1 = scanner.nextInt();

                    System.out.print("Goles del segundo equipo: ");
                    int g2 = scanner.nextInt();

                    // Se crea el partido usando los equipos seleccionados
                    torneo.crearPartido(
                            torneo.getEquipos().get(e1),
                            torneo.getEquipos().get(e2),
                            g1,
                            g2
                    );

                    System.out.println("Partido creado correctamente.");

                    break;

                case 3:

                    // Muestra todos los equipos registrados en el sistema
                    torneo.mostrarEquipos();

                    break;

                case 4:

                    // Muestra todos los partidos registrados
                    torneo.mostrarPartidos();

                    break;

                case 5:

                    // Guarda los datos del sistema antes de cerrar
                    torneo.guardarDatos();

                    System.out.println("Saliendo del sistema...");

                    break;

                default:

                    // Mensaje si el usuario ingresa una opción no válida
                    System.out.println("Opcion invalida");

            }

        } while (opcion != 5); // El programa se repite hasta seleccionar salir

        // Cierre del Scanner para liberar recursos
        scanner.close();
    }
}
    
