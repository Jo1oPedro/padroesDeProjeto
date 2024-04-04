import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Carrinho implements Iterable<Produto>{
    private List<Produto> produtos = new ArrayList<Produto>();

    public Carrinho adicionaProduto(Produto produto) {
        this.produtos.add(produto);
        return this;
    }

    @Override
    public Iterator<Produto> iterator() {
        return this.produtos.iterator();
    }
}
