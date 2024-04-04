package composite.Componentes;

import composite.Pecas.Peca;

import java.util.ArrayList;
import java.util.List;

public abstract class Componente {

    private List<Peca> pecas = new ArrayList<Peca>();
    private String descricao;
    private Float valor;

    public Componente setPecas(Peca peca) {
        this.pecas.add(peca);
        return this;
    }

    public String getPecas() {
        StringBuilder saida = new StringBuilder();
        for(Peca pecas : this.pecas) {
            saida.append(pecas.getDescricao()).append(" / ");
        }

        return saida.toString();
    }

    public Componente setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public String getDescricao() {
        StringBuilder saida = new StringBuilder(this.descricao + " / valor: " + this.getValor() + "\nPeças: \n");
        for(Peca peca : this.pecas) {
            saida.append(peca.getDescricao()).append("\n");
        }

        return saida.toString();
    }

    public Componente setValor(Float valor) {
        this.valor = valor;
        return this;
    }

    public Float getValor() {
        return this.valor;
    }
}
