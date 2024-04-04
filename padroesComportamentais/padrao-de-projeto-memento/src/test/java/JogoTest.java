import Jogo.Jogo;
import org.junit.Test;
import Jogo.JogoEstadoAlpha;
import Jogo.JogoEstadoFracassado;
import Jogo.JogoEstadoConceito;

import static org.junit.Assert.*;

public class JogoTest {

    // Jogo em conceito
    @Test
    public void deveArmazenarEstados() {
        Jogo jogo = new Jogo();
        jogo.setEstado(JogoEstadoAlpha.getInstance());
        jogo.setEstado(JogoEstadoFracassado.getInstance());
        assertEquals(3, jogo.getEstados().size());
    }

    @Test
    public void deveRetornarEstadoInicial() {
        Jogo jogo = new Jogo();
        jogo.setEstado(JogoEstadoAlpha.getInstance());
        jogo.setEstado(JogoEstadoFracassado.getInstance());
        jogo.restauraEstado(0);
        assertTrue(jogo.getEstado() instanceof JogoEstadoConceito);
    }

    @Test
    public void deveRetornarEstadoAnterior() {
        Jogo jogo = new Jogo();
        jogo.setEstado(JogoEstadoAlpha.getInstance());
        jogo.setEstado(JogoEstadoFracassado.getInstance());
        jogo.restauraEstado(1);
        assertTrue(jogo.getEstado() instanceof JogoEstadoAlpha);
    }

    @Test
    public void deveRetornarExcecaoIndiceInvalido() {
        try {
            Jogo jogo = new Jogo();
            jogo.restauraEstado(1);
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Índice inválido", exception.getMessage());
        }
    }
}