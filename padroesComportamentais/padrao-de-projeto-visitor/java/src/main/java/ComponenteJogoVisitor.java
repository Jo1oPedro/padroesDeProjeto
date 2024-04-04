public class ComponenteJogoVisitor implements IVisitor {

    public String exibir(IComponenteJogo componentesJogo) {
        return componentesJogo.aceitar(this);
    }
    @Override
    public String exibirItem(Item item) {
        return item.getNome() + " / " + item.getLevel();
    }

    @Override
    public String exibirPersonagem(Personagem personagem) {
        return personagem.getNome();
    }
}
