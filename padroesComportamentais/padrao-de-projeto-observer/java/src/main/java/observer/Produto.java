package observer;

public class Produto {
    private String nome;
    private Float preco;
    private Float promocao;

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Float getPreco() {
        return this.preco - this.preco * (this.getPromocao() / 100);
    }

    public Produto setPreco(Float preco) {
        this.preco = preco;
        return this;
    }

    public Produto setPromocao(float desconto) {
        this.promocao = desconto;
        return this;
    }

    public Float getPromocao() {
        return this.promocao;
    }

    @Override
    public String toString() {
        return "nome do produto: " + this.getNome() + " | preco: " + this.getPreco();
    }
}
