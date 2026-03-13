package sistematorneos.util;

/*
 * Interfaz: Mostrable
 * ---------------------------------------------------------
 * Esta interfaz define un comportamiento que deben cumplir
 * las clases que quieran mostrar información en pantalla.
 *
 * Las clases que implementen esta interfaz están obligadas
 * a implementar el método mostrarInformacion().
 *
 * En este proyecto, varias clases utilizan esta interfaz
 * para mostrar sus datos en consola, por ejemplo:
 *
 * - Equipo
 * - Partido
 *
 * Esto permite aplicar el concepto de polimorfismo,
 * ya que diferentes objetos pueden mostrar su información
 * de distintas formas usando el mismo método.
 */

public interface Mostrable {

    /*
     * Método que debe ser implementado por las clases
     * que utilicen esta interfaz.
     *
     * Su función es mostrar la información del objeto
     * en consola.
     */
    void mostrarInformacion();

}