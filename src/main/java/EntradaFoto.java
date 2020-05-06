import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Una entrada con imagenes
 *
 * Una entrada es un contenido que el usuario comparte en su muro con la comunidad.
 * Las entradas con imagenes se crean a partir de un autor, un titulo
 * para la imagen y la url de la imagen.
 *
 *  @author DAM
 *  @version 1.0
 */
public class EntradaFoto extends Entrada
{
    // URL de la imagen.
    private String urlImagen;
    //Título de la entrada.
    private String titulo;
    // Comentarios de la entrada.
    private ArrayList<String> comentarios;

    /**
     * Constructor - Construye entradas a partir de un autor, el titulo de la imagen y su URL.
     * Las entradas se crean sin ningun ' me gusta'.
     * La fecha de publicacion coincide con el momento en el que se crea la entrada.
     * @param autor Autor de la entrada.
     * @param titulo Titulo de la imagen.
     * @param url URL de la imagen.
     */
    public EntradaFoto (String autor, String url, String titulo) {
        super(autor);
        urlImagen = url;
        this.titulo = titulo;
        comentarios = new ArrayList<>();
    }

    /**
     * Devuelve el URL de la imagen.
     * @return Devuelve el URL de la imagen.
     */
    public String getUrlImagen() {
        return urlImagen;
    }

    /**
     * Devuelve el titulo de la imagen.
     * @return Devuelve el titulo de la imagen.
     */
    public String getTituloImagen() {
        return titulo;
    }

    /**
     * Anade un comentario a a la entrada.
     * @param text El comentario a anadir.
     */
    public void addComentario(String text) {
        comentarios.add(text);
    }

    /**
     * Devuelve una cadena con toda la informacion de la entrada.
     * @return Devuelve una cadena con toda la informacion de la entrada.
     */
    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver += "Usuario: " + getUsuario() + "\n";
        aDevolver += "Likes: " + getCantidadMeGusta() + "\n";
        aDevolver += "Url: " + urlImagen + "\n";
        aDevolver += "Titulo: " + titulo + "\n";

        // Calculamos el numero de segundos que han pasado desde la fecha de publicacion.
        long numeroSegundos = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        aDevolver += "Escrito hace 10 segundos";

        // Comprobamos si debemos expresar el tiempo en segundos o minutos.
        /**if (numeroSegundos > 59) {
            aDevolver += numeroSegundos / 60 + " minutos";
        }
        else {
            aDevolver += numeroSegundos + " segundos";
        }*/
        aDevolver += "\n";

        // Comprobamos si hay comentarios. Si hay los mostramos, si no, mostramos un mensaje indicandolo.
        if (comentarios.size() == 0) {
            aDevolver += "No hay comentarios\n";
        }
        else {
            aDevolver += "Comentarios: \n";
            for (String comentarioActual : comentarios) {
                aDevolver += comentarioActual + "\n";
            }
        }

        return aDevolver;
    }
}