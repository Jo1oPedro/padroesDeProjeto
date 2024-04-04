package Jogo;

public abstract class JogoEstado {

    public abstract String getEstado();

    public boolean conceito(Jogo jogo) {
        return false;
    }
    public boolean alpha(Jogo jogo) {
        return false;
    }

    public boolean beta(Jogo jogo) {
        return false;
    }

    public boolean lancar(Jogo jogo) {
        return false;
    }

    public boolean fracassar(Jogo jogo) {
        return false;
    }
}
