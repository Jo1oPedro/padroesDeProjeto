public class Produto {

    private String nome;
    private Float valor;

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Float getValor() {
        return valor;
    }

    public Produto setValor(Float valor) {
        this.valor = valor;
        return this;
    }
}
