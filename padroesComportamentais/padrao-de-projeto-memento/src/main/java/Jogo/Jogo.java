package Jogo;

import java.util.ArrayList;
import java.util.List;

public class Jogo {

    private JogoEstado jogoEstado = null;
    private List<JogoEstado> estadoHistoric = new ArrayList<JogoEstado>();
    public Jogo() {
        this.jogoEstado = JogoEstadoConceito.getInstance();
        this.estadoHistoric.add(this.jogoEstado);
    }

    public Jogo setEstado(JogoEstado jogoEstado) {
        this.jogoEstado = jogoEstado;
        this.estadoHistoric.add(jogoEstado);
        return this;
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.estadoHistoric.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.jogoEstado = this.estadoHistoric.get(indice);
    }

    public List<JogoEstado> getEstados() {
        return this.estadoHistoric;
    }

    public JogoEstado getEstado() {
        return this.jogoEstado;
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
