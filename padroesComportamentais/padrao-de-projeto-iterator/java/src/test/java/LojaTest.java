import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LojaTest {

    @Test
    public void deveRetornarValorTotalCarrinho() {
        Produto produto = new Produto().setNome("teste").setValor(10f);
        Produto produto2 = new Produto().setNome("teste2").setValor(15f);
        Carrinho carrinho = new Carrinho().adicionaProduto(produto).adicionaProduto(produto2);
        Loja loja = new Loja();
        assertEquals(25f, loja.contaValorTotalCarrinho(carrinho), 0.01);
    }

    @Test
    public void deveRetornarQuantidadeProdutoCarrinho() {
        Produto produto = new Produto().setNome("teste").setValor(10f);
        Produto produto2 = new Produto().setNome("teste2").setValor(15f);
        Carrinho carrinho = new Carrinho().adicionaProduto(produto).adicionaProduto(produto2);
        Loja loja = new Loja();
        assertEquals(2, loja.contaTotalProdutosCarrinho(carrinho));
    }
}
