import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PartidaTest {

    @Test
    public void deveRetornarDanoPorcentagem() {
        Partida partida = new Partida();
        partida.setDano(1000);
        assertEquals("100%", partida.getDanoPorcentagem());
    }

    @Test
    public void deveRetornarDanoNumerico() {
        Partida partida = new Partida();
        partida.setDano(500f);
        assertEquals(500f, partida.getDanoNumerico(), 000.1);
    }
}
