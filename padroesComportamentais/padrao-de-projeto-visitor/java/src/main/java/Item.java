public class Item implements IComponenteJogo {

    private String nome;
    private Integer level;

    public String getNome() {
        return nome;
    }

    public Item setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public Item setLevel(Integer level) {
        this.level = level;
        return this;
    }

    @Override
    public String aceitar(IVisitor visitor) {
        return visitor.exibirItem(this);
    }
}
