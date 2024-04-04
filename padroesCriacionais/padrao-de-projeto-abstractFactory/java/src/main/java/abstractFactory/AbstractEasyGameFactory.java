package abstractFactory;

public class AbstractEasyGameFactory implements iAbstractGameFactory{

    @Override
    public iMap getMap() {
        return new EasyMap();
    }

    @Override
    public iEnemies getEnemies() {
        return new EasyEnemies();
    }
}
