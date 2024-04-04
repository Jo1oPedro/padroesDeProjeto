abstract public class Produto {

    private float valorProduto;
    public Produto setValorProduto(float valor) {
        this.valorProduto = valor;
        return this;
    }

    public float getValorProduto() {
        return this.valorProduto;
    }

    public abstract float getValorAcrescimo();

    public float getValorProdutoFinal() {
        return this.getValorProduto() + this.getValorAcrescimo();
    }
}
