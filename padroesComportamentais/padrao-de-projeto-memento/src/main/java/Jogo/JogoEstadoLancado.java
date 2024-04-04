package Jogo;

public class JogoEstadoLancado extends JogoEstado {
    private static JogoEstadoLancado instance = new JogoEstadoLancado();

    private JogoEstadoLancado() {}

    public static JogoEstadoLancado getInstance() {
        return JogoEstadoLancado.instance;
    }

    @Override
    public String getEstado() {
        return "Lancado";
    }

    public boolean fracassar(Jogo jogo) {
        jogo.setEstado(JogoEstadoFracassado.getInstance());
        return true;
    }
}
