import org.example.Usuario;
import org.junit.Test;

import static org.junit.Assert.*;

public class UsuarioBuilderTest {

    @Test
    public void deveRetornarExcecaoParaNomeInvalido() {
        try {
            UsuarioBuilder usuarioBuilder = new UsuarioBuilder();
            usuarioBuilder.build();
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Nome inválido", exception.getMessage());
        }
    }

    @Test
    public void deveRetornarExcessaoParaEmailInvalido() {
        try {
            UsuarioBuilder usuarioBuilder = new UsuarioBuilder();
            usuarioBuilder.setNome("João");
            usuarioBuilder.build();
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Email inválido", exception.getMessage());
        }
    }

    @Test
    public void deveRetornarExcessaoParaSenhaInvalida() {
        try {
            UsuarioBuilder usuarioBuilder = new UsuarioBuilder();
            usuarioBuilder.setNome("João");
            usuarioBuilder.setEmail("joao@gmail.com");
            usuarioBuilder.build();
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Senha inválida", exception.getMessage());
        }
    }

    @Test
    public void deveRetornarUsuarioComSucesso() {
        UsuarioBuilder usuarioBuilder = new UsuarioBuilder();
        usuarioBuilder.setNome("João");
        usuarioBuilder.setEmail("joao@gmail.com");
        usuarioBuilder.setSenha("123456");
        Usuario usuario = usuarioBuilder.build();
        assertTrue(usuario instanceof Usuario);
    }
}
