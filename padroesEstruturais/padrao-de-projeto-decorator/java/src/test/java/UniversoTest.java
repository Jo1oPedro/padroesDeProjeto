import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniversoTest {

    @Test
    public void deveRetornarPesoUniversoVazio() {
        ICorpoCeleste universo = new Universo();
        assertEquals(0f, universo.getMassaTotal(), 0.01);
    }

    @Test
    public void deveRetornarPesoUniversoComCometa() {
        ICorpoCeleste universo = new Cometa(new Universo());
        assertEquals(500f, universo.getMassaTotal(), 0.01);
    }

    @Test
    public void deveRetornarPesoUniversoComPlaneta() {
        ICorpoCeleste universo = new Planeta(new Universo());
        assertEquals(5000f, universo.getMassaTotal(), 0.01);
    }

    @Test
    public void deveRetornarPesoUniversoComEstrela() {
        ICorpoCeleste universo = new Estrela(new Universo());
        assertEquals(10000f, universo.getMassaTotal(), 0.01);
    }

    @Test
    public void deveRetornarPesoUniveroComCometaMaisPlaneta() {
        ICorpoCeleste universo = new Cometa(new Planeta(new Universo()));
        assertEquals(5500f, universo.getMassaTotal(), 0.01);
    }

    @Test
    public void deveRetornarPesoUniversoComCometaMaisEstrela() {
        ICorpoCeleste universo = new Cometa(new Estrela(new Universo()));
        assertEquals(10500f, universo.getMassaTotal(), 0.01);
    }

    @Test
    public void deveReRetornarPesoUniversoComCometaMaisPlanetaMaisEstrela() {
        ICorpoCeleste universo = new Estrela(new Planeta(new Cometa(new Universo())));
        assertEquals(15500f, universo.getMassaTotal(), 0.01);
    }

    @Test
    public void deveRetornarEstruturaDoUniversoComCometaMaisPlanetaMaisEstrela() {
        ICorpoCeleste universo = new Estrela(new Planeta(new Cometa(new Universo())));
        assertEquals("Estrela/Planeta/Cometa/", universo.getEstrutura());
    }
}
