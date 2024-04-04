import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void deveCalcularPrecoProduto() {
        Cliente cliente = new Cliente();
        Double precoProdutoImportado = cliente.importaProduto(15, 10);
        assertEquals(50, precoProdutoImportado);
    }
}
