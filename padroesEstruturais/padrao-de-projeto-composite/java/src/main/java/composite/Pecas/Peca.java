package composite.Pecas;

public abstract class Peca {
    private String descricao;

    public Peca setDescricacao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
