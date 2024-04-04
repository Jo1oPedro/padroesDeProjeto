import classes.Guerreiro;
import classes.Mago;
import classes.Tank;
import org.junit.Test;
import racas.Anao;

import static org.junit.Assert.assertEquals;

public class AnaoTest {

    @Test
    public void deveRetornarPoderAnaoGuerreiro() {
        Anao anao = new Anao(new Guerreiro(10));
        assertEquals(8000, anao.calculaPoder(), 0.01);
    }

    @Test
    public void deveRetornarPoderAnaoMago() {
        Anao anao = new Anao(new Mago(100));
        assertEquals(80000, anao.calculaPoder(), 0.01);
    }

    @Test
    public void deveRetornarPoderAnaoTank() {
        Anao anao = new Anao(new Tank(1));
        assertEquals(800, anao.calculaPoder(), 0.01);
    }
}
