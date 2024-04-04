import Jogo.Jogo;
import org.junit.Test;
import Jogo.JogoEstadoAlpha;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JogoTest {

    // Jogo em conceito
    @Test
    public void naoDevePermitirConceitoDeJogoEmEstadoDeConceito() {
        Jogo jogo = new Jogo();
        assertFalse(jogo.conceito());
    }

    @Test
    public void devePermitirJogoEmConceitoPassarParaAlpha() {
        Jogo jogo = new Jogo();
        assertTrue(jogo.alpha());
    }

    @Test
    public void naoDevePermitirJogoEmConceitoPassarParaBeta() {
        Jogo jogo = new Jogo();
        assertFalse(jogo.beta());
    }

    @Test
    public void naoDevePermitirJogoEmConceitoPassarParaLancamento() {
        Jogo jogo = new Jogo();
        assertFalse(jogo.lancar());
    }

    @Test
    public void devePermitirJogoEmConceitoPassarParaFracasso() {
        Jogo jogo = new Jogo();
        assertTrue(jogo.fracassar());
    }

    // Jogo em Alpha

    @Test
    public void devePermitirJogoEmAlphaPassarParaConceito() {
        Jogo jogo = new Jogo().setEstado(JogoEstadoAlpha.getInstance());
        assertTrue(jogo.conceito());
    }

    @Test
    public void naoDevePermitirAplhaDeJogoEmEstadoDeAlpha() {
        Jogo jogo = new Jogo().setEstado(JogoEstadoAlpha.getInstance());
        assertFalse(jogo.alpha());
    }

    @Test
    public void devePermitirJogoEmAlphaPassarParaBeta() {
        Jogo jogo = new Jogo().setEstado(JogoEstadoAlpha.getInstance());
        assertTrue(jogo.beta());
    }

    @Test
    public void naoDevePermitirJogoEmAlphaPassarParaLancamento() {
        Jogo jogo = new Jogo().setEstado(JogoEstadoAlpha.getInstance());
        assertFalse(jogo.lancar());
    }

    @Test
    public void devePermitirJogoEmAlphaPassarParaFracasso() {
        Jogo jogo = new Jogo().setEstado(JogoEstadoAlpha.getInstance());
        assertTrue(jogo.fracassar());
    }
}
