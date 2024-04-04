import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClienteTest {

    @Test
    public void deveReclamarMagalu() {
        Cliente cliente = new Cliente();
        assertEquals(
                "O suporte agradece seu contato.\n" +
                "O marketplace Magalu respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>magalu recebeu a reclamacao: servico ruim",
                cliente.reclamar("servico ruim", "Magalu")
        );
    }

    @Test
    public void deveSugerirMagalu() {
        Cliente cliente = new Cliente();
        assertEquals(
                "O suporte agradece seu contato.\n" +
                        "O marketplace Magalu respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>magalu recebeu a sugestao: melhora o servico",
                cliente.sugerir("melhora o servico", "Magalu")
        );
    }

    @Test
    public void deveReclamarMercadoLivre() {
        Cliente cliente = new Cliente();
        assertEquals(
                "O suporte agradece seu contato.\n" +
                        "O marketplace MercadoLivre respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>mercado livre recebeu a reclamacao: servico ruim",
                cliente.reclamar("servico ruim", "MercadoLivre")
        );
    }

    @Test
    public void deveSugerirMercadoLivre() {
        Cliente cliente = new Cliente();
        assertEquals(
                "O suporte agradece seu contato.\n" +
                        "O marketplace MercadoLivre respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>mercado livre recebeu a sugestao: melhora o servico",
                cliente.sugerir("melhora o servico", "MercadoLivre")
        );
    }
}
