import classes.Guerreiro;
import classes.Mago;
import classes.Tank;
import org.junit.Test;
import racas.Humano;

import static org.junit.Assert.assertEquals;

public class HumanoTest {

    @Test
    public void deveRetornarPoderHumanoGuerreiro() {
        Humano humano = new Humano(new Guerreiro(10));
        assertEquals(10000, humano.calculaPoder(), 0.01);
    }

    @Test
    public void deveRetornarPoderHumanoMago() {
        Humano humano = new Humano(new Mago(100));
        assertEquals(100000, humano.calculaPoder(), 0.01);
    }

    @Test
    public void deveRetornarPoderHumanoTank() {
        Humano humano = new Humano(new Tank(1));
        assertEquals(1000, humano.calculaPoder(), 0.01);
    }
}
