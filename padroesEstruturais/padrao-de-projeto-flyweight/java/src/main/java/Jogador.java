public class Jogador {
    private String nome;
    private Guilda guilda;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Jogador ingressarGuilda(String nome) {
        this.guilda = GuildaFactory.ingressarGuilda(nome);
        return this;
    }

    public String dadosJogador() {
        return "Aluno{" +
                "nome='" + this.nome + '\'' +
                ", nome da guilda='" + this.guilda.getNome() + '\'' +
                '}';
    }
}
