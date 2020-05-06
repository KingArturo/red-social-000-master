import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Entrada {

    // Nombre del usuario.
    private String usuario;
    // Fecha de publicacion de la entrada.
    private LocalDateTime momentoPublicacion;
    // Numero de 'me gusta' de la entrada.
    private int cantidadMeGusta;

    public Entrada(String usuario) {
        this.usuario = usuario;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
    }

    /**
     * Anade un 'me gusta' a la entrada.
     */
    public void meGusta() {
        cantidadMeGusta += 1;
    }

    /**
     * Devuelve la fecha de publicacion.
     * @return Devuelve la fecha de publicacion.
     */
    public LocalDateTime getMomentoPublicacion() {
        return momentoPublicacion;
    }

    /**
     * Devuelve un String con la informacion de
     * la entrada.
     */
    public String toString() {
        return "";
    }

    public String getUsuario() {
        return usuario;
    }

    public int getCantidadMeGusta() {
        return cantidadMeGusta;
    }


}
