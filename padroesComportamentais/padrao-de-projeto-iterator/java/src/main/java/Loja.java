public class Loja {

    public Float contaValorTotalCarrinho(Carrinho carrinho) {
        float valorTotal = 0f;
        for(Produto produto : carrinho) {
            valorTotal += produto.getValor();
        }
        return valorTotal;
    }

    public int contaTotalProdutosCarrinho(Carrinho carrinho) {
        int quantidade = 0;
        for(Produto produto : carrinho) {
            quantidade++;
        }
        return quantidade;
    }
}
