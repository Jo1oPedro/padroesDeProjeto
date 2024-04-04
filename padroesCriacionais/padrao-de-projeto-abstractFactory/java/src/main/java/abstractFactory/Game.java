package abstractFactory;

public class Game {

    public iEnemies enemies = null;
    public iMap map = null;

    public Game(iAbstractGameFactory abstractGameFactory) {
        this.enemies = abstractGameFactory.getEnemies();
        this.map = abstractGameFactory.getMap();
    }

    public String getEnemies() {
        return this.enemies.makeEnemies();
    }

    public String getMap() {
        return this.map.makeMap();
    }
}
