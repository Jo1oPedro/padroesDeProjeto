import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PedidoTest {
    @Test
    public void deveCalcularFreteParaJadlog() {
        Jadlog jadlog = new Jadlog();
        Pedido pedido = new Pedido().setFormaEnvio(jadlog);
        assertEquals(20f, pedido.calculaEntrega(11, 10), 0.1);
    }

    @Test
    public void deveCalcularFreteParaPAC() {
        PAC pac = new PAC();
        Pedido pedido = new Pedido().setFormaEnvio(pac);
        assertEquals(50f, pedido.calculaEntrega(11, 10), 0.1);
    }

    @Test
    public void deveCalcularFreteParaSedex() {
        Sedex sedex = new Sedex();
        Pedido pedido = new Pedido().setFormaEnvio(sedex);
        assertEquals(100f, pedido.calculaEntrega(11, 10), 0.1);
    }
}
