public class Personagem implements IComponenteJogo {

    private String nome;

    public String getNome() {
        return nome;
    }

    public Personagem setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String aceitar(IVisitor visitor) {
        return visitor.exibirPersonagem(this);
    }
}
