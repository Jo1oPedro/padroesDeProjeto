package abstractFactory;

public class AbstractHardGameFactory implements iAbstractGameFactory {

    @Override
    public iMap getMap() {
        return new HardMap();
    }

    @Override
    public iEnemies getEnemies() {
        return new HardEnemies();
    }
}
