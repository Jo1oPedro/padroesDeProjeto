import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JogadorTest {

    @Test
    public void deveRetornarJogadores() {
        Jogador jogador = (new Jogador("joao")).ingressarGuilda("guild wars");
        Jogador jogador2 = (new Jogador("maria")).ingressarGuilda("baldurs gate");
        Jogador jogador3 = (new Jogador("pedro")).ingressarGuilda("shadow of mordor");
        Jogador jogador4 = (new Jogador("marcos")).ingressarGuilda("guild wars");

        List<String> saida = new ArrayList<String>();
        saida.add("shadow of mordor");
        saida.add("guild wars");
        saida.add("baldurs gate");

        assertEquals(saida, GuildaFactory.ObterGuildas());
    }

    public void deveRetornarTotalGuildas() {
        Jogador jogador = (new Jogador("joao")).ingressarGuilda("guild wars");
        Jogador jogador2 = (new Jogador("maria")).ingressarGuilda("baldurs gate");
        Jogador jogador3 = (new Jogador("pedro")).ingressarGuilda("shadow of mordor");
        Jogador jogador4 = (new Jogador("marcos")).ingressarGuilda("guild wars");

        assertEquals(3, GuildaFactory.getTotalGuildas());
    }
}
