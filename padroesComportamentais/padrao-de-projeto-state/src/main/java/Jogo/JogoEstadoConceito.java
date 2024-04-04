package Jogo;

public class JogoEstadoConceito extends JogoEstado {

    private static JogoEstadoConceito instance = new JogoEstadoConceito();
    private JogoEstadoConceito() {}

    public static JogoEstadoConceito getInstance() {
        return JogoEstadoConceito.instance;
    }
    @Override
    public String getEstado() {
        return "Conceito";
    }

    @Override
    public boolean alpha(Jogo jogo) {
        jogo.setEstado(JogoEstadoAlpha.getInstance());
        return true;
    }

    @Override
    public boolean fracassar(Jogo jogo) {
        jogo.setEstado(JogoEstadoFracassado.getInstance());
        return true;
    }
}
