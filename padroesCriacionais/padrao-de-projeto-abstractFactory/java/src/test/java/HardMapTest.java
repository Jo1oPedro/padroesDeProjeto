import abstractFactory.HardMap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HardMapTest {

    @Test
    public void shouldReturnHardMap() {
        HardMap hardMap = new HardMap();
        assertEquals("gera mapa no modo dificil", hardMap.makeMap());
    }
}
