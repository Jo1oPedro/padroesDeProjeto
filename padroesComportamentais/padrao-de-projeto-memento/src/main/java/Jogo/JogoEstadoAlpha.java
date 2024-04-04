package Jogo;

public class JogoEstadoAlpha extends JogoEstado {


    private static JogoEstadoAlpha instance = new JogoEstadoAlpha();
    private JogoEstadoAlpha() {}

    public static JogoEstadoAlpha getInstance() {
        return JogoEstadoAlpha.instance;
    }

    @Override
    public String getEstado() {
        return "Alpha";
    }

    @Override
    public boolean conceito(Jogo jogo) {
        jogo.setEstado(JogoEstadoConceito.getInstance());
        return true;
    }

    @Override
    public boolean beta(Jogo jogo) {
        jogo.setEstado(JogoEstadoBeta.getInstance());
        return true;
    }

    @Override
    public boolean fracassar(Jogo jogo) {
        jogo.setEstado(JogoEstadoFracassado.getInstance());
        return true;
    }
}
