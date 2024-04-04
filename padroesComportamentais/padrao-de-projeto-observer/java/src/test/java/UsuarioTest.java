import observer.Loja;
import observer.Produto;
import observer.Usuario;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UsuarioTest {

    @Test
    public void deveNotificarUsuario() {
        Loja loja = new Loja();
        Usuario usuario = new Usuario();
        usuario.observaPromocao(loja);
        loja.notificaPromocao(new Produto().setNome("camisa").setPreco(10f).setPromocao(10f));
        assertEquals("nome do produto: camisa | preco: 9.0", usuario.getMensagemPromocao());
    }

    @Test
    public void deveNotificarUsuarios() {
        Loja loja = new Loja();
        Usuario usuario = new Usuario();
        Usuario usuario2 = new Usuario();
        usuario.observaPromocao(loja);
        usuario2.observaPromocao(loja);
        loja.notificaPromocao(new Produto().setNome("camisa").setPreco(10f).setPromocao(10f));
        assertEquals("nome do produto: camisa | preco: 9.0", usuario.getMensagemPromocao());
        assertEquals("nome do produto: camisa | preco: 9.0", usuario2.getMensagemPromocao());
    }

    @Test
    public void naoDeveNotificarUsuario() {
        Loja loja = new Loja();
        Usuario usuario = new Usuario();

        loja.notificaPromocao(new Produto().setNome("camisa").setPreco(10f).setPromocao(10f));
        assertEquals("", usuario.getMensagemPromocao());
    }

    @Test
    public void deveNotificarSomenteUsuarioPrimeiraLoja() {
        Loja loja = new Loja();
        Loja loja2 = new Loja();
        Usuario usuario = new Usuario();
        Usuario usuario2 = new Usuario();
        usuario.observaPromocao(loja);
        usuario2.observaPromocao(loja2);
        loja.notificaPromocao(new Produto().setNome("camisa").setPreco(10f).setPromocao(10f));
        assertEquals("nome do produto: camisa | preco: 9.0", usuario.getMensagemPromocao());
        assertEquals("", usuario2.getMensagemPromocao());
    }
}
