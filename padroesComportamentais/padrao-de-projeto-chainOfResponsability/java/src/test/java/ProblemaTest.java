import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemaTest {
    FuncionarioSuporte funcionarioSuporte;
    FuncionarDevJunior funcionarDevJunior;
    FuncionarDevPleno funcionarDevPleno;
    FuncionarDevSenior funcionarDevSenior;

    @BeforeEach
    void setUp() {
        funcionarDevSenior = new FuncionarDevSenior(null);
        funcionarDevPleno = new FuncionarDevPleno(funcionarDevSenior);
        funcionarDevJunior = new FuncionarDevJunior(funcionarDevPleno);
        funcionarioSuporte = new FuncionarioSuporte(funcionarDevJunior);
    }

    @Test
    void deveRetornarProblemaCorrigidoPeloSuporte()
    {
        assertEquals("Suporte", funcionarioSuporte.solucionarProblema(new ErroUsuario()));
    }

    @Test
    void deveRetornarProblemaCorrigidoPeloDevJunior()
    {
        assertEquals("Dev junior", funcionarioSuporte.solucionarProblema(new BugSimples()));
    }

    @Test
    void deveRetornarProblemaCorrigidoPeloDevPleno()
    {
        assertEquals("Dev pleno", funcionarioSuporte.solucionarProblema(new BugMedio()));
    }

    @Test
    void deveRetornarProblemaCorrigidoPeloDevSenior()
    {
        assertEquals("Dev senior", funcionarioSuporte.solucionarProblema(new BugCritico()));
    }
}
