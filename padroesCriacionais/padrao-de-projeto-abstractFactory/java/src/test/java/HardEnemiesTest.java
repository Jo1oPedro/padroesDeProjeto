import abstractFactory.HardEnemies;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HardEnemiesTest {

    @Test
    public void shouldReturnHardEnemies() {
        HardEnemies hardEnemies = new HardEnemies();
        assertEquals("gera inimigos no modo dificil", hardEnemies.makeEnemies());
    }
}
