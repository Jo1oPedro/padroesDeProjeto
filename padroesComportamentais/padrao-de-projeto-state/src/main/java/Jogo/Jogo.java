package Jogo;

public class Jogo {

    private JogoEstado jogoEstado = null;
    public Jogo() {
        this.jogoEstado = JogoEstadoConceito.getInstance();
    }

    public Jogo setEstado(JogoEstado jogoEstado) {
        this.jogoEstado = jogoEstado;
        return this;
    }

    public boolean conceito() {
        return this.jogoEstado.conceito(this);
    }

    public boolean alpha() {
        return this.jogoEstado.alpha(this);
    }

    public boolean beta() {
        return this.jogoEstado.beta(this);
    }

    public boolean lancar() {
        return this.jogoEstado.lancar(this);
    }

    public boolean fracassar() {
        return this.jogoEstado.fracassar(this);
    }
}
