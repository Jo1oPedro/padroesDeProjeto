package Jogo;

public class JogoEstadoBeta extends JogoEstado {

    private static JogoEstadoBeta instance = new JogoEstadoBeta();
    private JogoEstadoBeta() {}

    public static JogoEstadoBeta getInstance() {
        return JogoEstadoBeta.instance;
    }

    @Override
    public String getEstado() {
        return "Beta";
    }

    @Override
    public boolean lancar(Jogo jogo) {
        jogo.setEstado(JogoEstadoLancado.getInstance());
        return true;
    }

    @Override
    public boolean fracassar(Jogo jogo) {
        jogo.setEstado(JogoEstadoFracassado.getInstance());
        return true;
    }
}
