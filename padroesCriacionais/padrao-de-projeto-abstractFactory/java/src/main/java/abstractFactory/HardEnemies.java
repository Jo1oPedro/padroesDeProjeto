package abstractFactory;

public class HardEnemies implements iEnemies{

    @Override
    public String makeEnemies() {
        return "gera inimigos no modo dificil";
    }
}
