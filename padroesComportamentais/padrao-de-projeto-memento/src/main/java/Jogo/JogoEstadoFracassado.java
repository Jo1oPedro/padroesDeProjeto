package Jogo;

public class JogoEstadoFracassado extends JogoEstado {

    private static JogoEstadoFracassado instance = new JogoEstadoFracassado();
    private JogoEstadoFracassado() {}

    public static JogoEstadoFracassado getInstance() {
        return JogoEstadoFracassado.instance;
    }

    @Override
    public String getEstado() {
        return "Fracassado";
    }

    public boolean conceito(Jogo jogo) {
        jogo.setEstado(JogoEstadoConceito.getInstance());
        return true;
    }
}
