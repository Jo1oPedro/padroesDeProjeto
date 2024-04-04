import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MagaluTest {
    Magalu magalu;
    Pedido pedido;

    @BeforeEach
    void setUp() {
        this.magalu = new Magalu();
        this.pedido = new Pedido(10f);
    }

    @Test
    void deveConfirmarPedido() {
        Tarefa confirmarPedido = new ConfirmarPedidoTarefa(this.pedido);
        this.magalu.executarTarefa(confirmarPedido);

        assertEquals("Pedido confirmado", this.pedido.getStatus());
    }

    @Test
    void deveCancelarFechamentoPedido() {
        Tarefa confirmarPedido = new ConfirmarPedidoTarefa(this.pedido);
        Tarefa cancelarPedido = new CancelarPedidoTarefa(this.pedido);

        this.magalu.executarTarefa(confirmarPedido);
        this.magalu.executarTarefa(cancelarPedido);

        this.magalu.cancelarUltimaTarefa();

        assertEquals("Pedido confirmado", this.pedido.getStatus());
    }
}
