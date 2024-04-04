import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NpcTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        Npc npc = new Npc("teste", "1", new Map("mapa de teste", "1", "999", "999"));
        Npc npcClone = npc.clone();
        npcClone.setName("testeClone");
        npcClone.setLevel("5");
        npcClone.getMap().setCoordinateNpcX("123");
        npcClone.getMap().setCoordinateNpcY("321");

        assertEquals("Npc{name=teste, level=1, map='Map{name='mapa de teste', level minimo='1', coordenada x='999', coordenada y='999'}'}", npc.toString());
        assertEquals("Npc{name=testeClone, level=5, map='Map{name='mapa de teste', level minimo='1', coordenada x='123', coordenada y='321'}'}", npcClone.toString());
    }
}
