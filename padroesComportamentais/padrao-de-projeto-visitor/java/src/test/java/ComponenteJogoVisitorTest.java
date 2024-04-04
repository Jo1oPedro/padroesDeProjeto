import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComponenteJogoVisitorTest {

    @Test
    public void deveExibirItem() {
        Item item = new Item().setNome("espada").setLevel(1);
        ComponenteJogoVisitor componenteJogoVisitor = new ComponenteJogoVisitor();
        assertEquals("espada / 1", componenteJogoVisitor.exibir(item));
    }

    @Test
    public void deveExibirPersonagem() {
        Personagem personagem = new Personagem().setNome("teste");
        ComponenteJogoVisitor componenteJogoVisitor = new ComponenteJogoVisitor();
        assertEquals("teste", componenteJogoVisitor.exibir(personagem));
    }
}
