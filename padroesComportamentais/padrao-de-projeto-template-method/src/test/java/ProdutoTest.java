import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProdutoTest {

    @Test
    public void deveRetornarPrecoSemAcrescimo() {
        Produto produto = new ProdutoBasico();
        produto.setValorProduto(10f);
        assertEquals(10f, produto.getValorProdutoFinal(), 0.01);
    }

    @Test
    public void deveRetornarPrecoComAcrescimo() {
        Produto produto = new ProdutoPremium();
        produto.setValorProduto(10f);
        assertEquals(60f, produto.getValorProdutoFinal(), 0.01);
    }
}
