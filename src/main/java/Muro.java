import java.util.ArrayList;

/**
 * El muro de nuestra red social.
 *
 * El muro es el lugar donde los usuarios publicaran sus entradas.
 *
 * @author DAM
 * @version 1.0
 */
public class Muro
{
    // Entradas
    private ArrayList<Entrada> entradas;

    /**
     * Constructor - Construye e inicializa un muro vacio.
     */
    public Muro() {
        //Inicializa mensajes y fotos.
        entradas = new ArrayList<>();
    }

    /**
     * Anade una entrada al muro.
     * @param entrada La entrada a anadir.
     */
    public void addEntrada(Entrada entrada) {
        entradas.add(entrada);
    }

    /**
     * Devuelve una cadena con toda la informacion del muro.
     * @return Devuelve una cadena con toda la informacion del muro.
     */
    @Override
    public String toString() {
        String aDevolver = "";

        // Buscamos todas las entradas
        for (Entrada entrada : entradas) {
            aDevolver += entrada + "\n\n";
        }

        return aDevolver;
    }

    public void mostrarDetallesTodasLasEntradas() {

        // Buscamos los detalles de las entradas.
        for (Entrada entrada : entradas) {
            entrada.mostrarDetallesPorPantalla();
        }

    }
}

