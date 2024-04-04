import abstractFactory.EasyEnemies;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EasyEnemiesTest {

    @Test
    public void shouldReturnEasyEnemies() {
        EasyEnemies easyEnemies = new EasyEnemies();
        assertEquals("gera inimigos no modo facil", easyEnemies.makeEnemies());
    }
}
