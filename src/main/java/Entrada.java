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
    // Comentarios de la entrada.
    private ArrayList<String> comentarios;

    public Entrada(String usuario) {
        this.usuario = usuario;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
        comentarios = new ArrayList<>();
    }

    /**
     * Anade un 'me gusta' a la entrada.
     */
    public void meGusta() {
        cantidadMeGusta += 1;
    }

    /**
     * Anade un comentario a a la entrada.
     * @param text El comentario a anadir.
     */
    public void addComentario(String text) {
        comentarios.add(text);
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

    public ArrayList<String> getComentarios() {
        return comentarios;
    }
}
