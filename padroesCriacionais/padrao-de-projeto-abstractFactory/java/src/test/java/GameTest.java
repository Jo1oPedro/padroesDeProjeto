import abstractFactory.AbstractEasyGameFactory;
import abstractFactory.AbstractHardGameFactory;
import abstractFactory.Game;
import abstractFactory.iAbstractGameFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    @Test
    public void shouldReturnEasyEnemies() {
        iAbstractGameFactory easyGameFactory = new AbstractEasyGameFactory();
        Game game = new Game(easyGameFactory);
        assertEquals("gera inimigos no modo facil", game.getEnemies());
    }

    @Test
    public void shoudlReturnEasyMap() {
        iAbstractGameFactory easyGameFactory = new AbstractEasyGameFactory();
        Game game = new Game(easyGameFactory);
        assertEquals("gera mapa no modo facil", game.getMap());
    }

    @Test
    public void shouldReturnHardEnemies() {
        iAbstractGameFactory easyGameFactory = new AbstractHardGameFactory();
        Game game = new Game(easyGameFactory);
        assertEquals("gera inimigos no modo dificil", game.getEnemies());
    }

    @Test
    public void shoudlReturnHardMap() {
        iAbstractGameFactory easyGameFactory = new AbstractHardGameFactory();
        Game game = new Game(easyGameFactory);
        assertEquals("gera mapa no modo dificil", game.getMap());
    }
}
