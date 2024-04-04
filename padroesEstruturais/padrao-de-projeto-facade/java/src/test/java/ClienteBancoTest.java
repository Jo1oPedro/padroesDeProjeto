import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClienteBancoTest {

    @Test
    public void deveRetornarPendenciaNoFinanceiro() {
        ClienteBanco clienteBanco = new ClienteBanco();
        Financeiro.getInstancia().addClientePendente(clienteBanco);

        assertEquals(false, ClienteBancoFacade.verificarPendencias(clienteBanco));
    }

    @Test
    public void deveRetornarPendenciasNoJuridico() {
        ClienteBanco clienteBanco = new ClienteBanco();
        Juridico.getInstancia().addClientePendente(clienteBanco);

        assertEquals(false, ClienteBancoFacade.verificarPendencias(clienteBanco));
    }

    @Test
    public void deveRetornarClienteSemPendencia() {
        ClienteBanco clienteBanco = new ClienteBanco();
        assertEquals(true, ClienteBancoFacade.verificarPendencias(clienteBanco));
    }
}
