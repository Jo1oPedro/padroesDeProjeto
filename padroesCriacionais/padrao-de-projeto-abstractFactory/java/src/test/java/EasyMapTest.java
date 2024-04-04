import abstractFactory.EasyMap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EasyMapTest {

    @Test
    public void shoudlReturnEasyMap() {
        EasyMap easyMap = new EasyMap();
        assertEquals("gera mapa no modo facil", easyMap.makeMap());
    }
}
