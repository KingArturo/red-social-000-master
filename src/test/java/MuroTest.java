import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de test para el muro de la red social
 *
 *  @author DAM
 *  @version 1.0
 */
public class MuroTest {
    @Test
    public void test01() {

        Muro muro = new Muro();

        EntradaTexto entrada01 = new EntradaTexto("Nacho", "Recien llegado de mis vacaciones en Hawai!");
        EntradaFoto entrada02 = new EntradaFoto("Luis", "https://bit.ly/2W1dO09", "Gracias");
        EntradaTexto entrada03 = new EntradaTexto("Begona", "Esta lloviendo ahi fuera...");
        EntradaFoto entrada04 = new EntradaFoto("Cristina", "https://bit.ly/3cY9vtD", "Una foto de mi nevera");
        EntradaEvento entrada05 = new EntradaEvento("Arturo", "Ha actualizado su perfil");
        EntradaEvento entrada06 = new EntradaEvento("Roberto", "Se ha unido ha el grupo de amigos de los animales");

        muro.addEntrada(entrada01);
        muro.addEntrada(entrada02);
        muro.addEntrada(entrada03);
        muro.addEntrada(entrada04);
        muro.addEntrada(entrada05);
        muro.addEntrada(entrada06);
        assertEquals(muro.toString(), "Usuario: Nacho\n" +
                "Likes: 0\n" +
                "Recien llegado de mis vacaciones en Hawai!\n" +
                "Escrito hace 10 segundos\n" +
                "No hay comentarios\n" +
                "\n" +
                "\n" +
                "Usuario: Luis\n" +
                "Likes: 0\n" +
                "Url: https://bit.ly/2W1dO09\n" +
                "Titulo: Gracias\n" +
                "Escrito hace 10 segundos\n" +
                "No hay comentarios\n" +
                "\n" +
                "\n" +
                "Usuario: Begona\n" +
                "Likes: 0\n" +
                "Esta lloviendo ahi fuera...\n" +
                "Escrito hace 10 segundos\n" +
                "No hay comentarios\n" +
                "\n" +
                "\n" +
                "Usuario: Cristina\n" +
                "Likes: 0\n" +
                "Url: https://bit.ly/3cY9vtD\n" +
                "Titulo: Una foto de mi nevera\n" +
                "Escrito hace 10 segundos\n" +
                "No hay comentarios\n" +
                "\n" +
                "\n" +
                "Usuario: Arturo\n" +
                "Likes: 0\n" +
                "EventoHa actualizado su perfil\n" +
                "Escrito hace 10 segundos\n" +
                "\n" +
                "\n" +
                "Usuario: Roberto\n" +
                "Likes: 0\n" +
                "EventoSe ha unido ha el grupo de amigos de los animales\n" +
                "Escrito hace 10 segundos\n" +
                "\n" +
                "\n");
        entrada01.mostrarAutorYMensaje();
    }

}
