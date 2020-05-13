import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Una entrada evento
 *
 * Una entrada es un contenido que el usuario comparte en su muro con la comunidad.
 * Las entradas con imagenes se crean a partir de un autor y un contenido.
 *
 *  @author DAM
 *  @version 1.0
 */
public class EntradaEvento extends Entrada {

    private String evento;

    /**
     * Constructor de la clase EntradaEvento
     * @param usuario
     * @param evento
     */
    public EntradaEvento(String usuario, String evento) {
        super(usuario);
        this.evento = evento;
    }

    /**
     * Metodo que devuelve el valor de la variable evento
     * @return
     */
    public String getEvento() {
        return evento;
    }

    /**
     * Devuelve una cadena con toda la informacion de la entrada.
     * @return Devuelve una cadena con toda la informacion de la entrada.
     */
    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver += super.toString();
        aDevolver += "Evento " + evento + "\n";

        return aDevolver;
    }

    public void mostrarDetallesPorPantalla() {
        System.out.println(evento);
    }
}
