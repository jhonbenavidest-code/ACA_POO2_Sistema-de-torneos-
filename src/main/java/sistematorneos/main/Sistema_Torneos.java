package sistematorneos.main;

import sistematorneos.servicio.TorneoServicio;
import sistematorneos.modelo.Equipo;
import java.util.Scanner;

public class Sistema_Torneos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TorneoServicio torneo = new TorneoServicio();

        int opcion = 0;

        do {

            System.out.println("\n===== SISTEMA DE TORNEOS =====");
            System.out.println("1. Registrar equipo");
            System.out.println("2. Crear partido");
            System.out.println("3. Mostrar equipos");
            System.out.println("4. Mostrar partidos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            try {

                opcion = scanner.nextInt();

            } catch (Exception e) {

                System.out.println("Error: debe ingresar un numero.");
                scanner.nextLine();
                opcion = 0;
                continue;

            }

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese ID del equipo: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese nombre del equipo: ");
                    String nombre = scanner.nextLine();

                    Equipo equipo = new Equipo(id, nombre);
                    torneo.registrarEquipo(equipo);

                    break;

                case 2:

                    if (torneo.getEquipos().size() < 2) {
                        System.out.println("Se necesitan al menos 2 equipos para crear un partido.");
                        break;
                    }

                    torneo.mostrarEquipos();

                    System.out.print("Seleccione el indice del primer equipo: ");
                    int e1 = scanner.nextInt();

                    System.out.print("Seleccione el indice del segundo equipo: ");
                    int e2 = scanner.nextInt();

                    System.out.print("Goles del primer equipo: ");
                    int g1 = scanner.nextInt();

                    System.out.print("Goles del segundo equipo: ");
                    int g2 = scanner.nextInt();

                    torneo.crearPartido(
                            torneo.getEquipos().get(e1),
                            torneo.getEquipos().get(e2),
                            g1,
                            g2
                    );

                    System.out.println("Partido creado correctamente.");

                    break;

                case 3:

                    torneo.mostrarEquipos();

                    break;

                case 4:

                    torneo.mostrarPartidos();

                    break;

                case 5:

                    torneo.guardarDatos();
                    System.out.println("Saliendo del sistema...");

                    break;

                default:

                    System.out.println("Opcion invalida");

            }

        } while (opcion != 5);

        scanner.close();
    }
}
    
