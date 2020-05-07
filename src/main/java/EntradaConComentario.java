import java.util.ArrayList;

public class EntradaConComentario extends Entrada {
    // Comentarios de la entrada.
    private ArrayList<String> comentarios;

    public EntradaConComentario(String usuario) {
        super(usuario);
        this.comentarios = new ArrayList<>();
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    /**
     * Anade un comentario a a la entrada.
     * @param text El comentario a anadir.
     */
    public void addComentario(String text) {
        comentarios.add(text);
    }

    public String getComentariosString() {
        String aDevolver = "";
        // Comprobamos si hay comentarios. Si hay los mostramos, si no, mostramos un mensaje indicandolo.
        if (comentarios.size() == 0)         {
            aDevolver += "No hay comentarios\n";
        }
        else {
            aDevolver += "Comentarios: \n";
            for(String comentarioActual : comentarios){
                aDevolver += comentarioActual + "\n";
            }
        }
        return aDevolver;
    }
}
