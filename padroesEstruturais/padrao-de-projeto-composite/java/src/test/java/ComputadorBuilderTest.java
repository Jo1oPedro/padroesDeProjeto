import composite.Componentes.Fonte;
import composite.Componentes.PlacaMae;
import composite.Componentes.Processador;
import composite.Computador;
import composite.Pecas.Parafuso;
import composite.builders.ComputadorBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ComputadorBuilderTest {

    @Test
    public void deveRetornarExcecaoParaComputadorSemPecas() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            computadorBuilder.build();
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Computador sem peças", exception.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoParaComputadorIncompletoSemPlacaMae() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder().setComponents(new Processador()).setComponents(new Fonte());
            computadorBuilder.build();
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Computador incompleto", exception.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoParaComputadorIncompletoSemProcessador() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder().setComponents(new PlacaMae()).setComponents(new Fonte());
            computadorBuilder.build();
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Computador incompleto", exception.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoParaComputadorIncompletoSemFonte() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder().setComponents(new PlacaMae()).setComponents(new Fonte());
            computadorBuilder.build();
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Computador incompleto", exception.getMessage());
        }
    }

    @Test
    public void deveRetornarComputadorComponentes() {
        ComputadorBuilder computadorBuilder = new ComputadorBuilder();
        computadorBuilder
            .setComponents(
                    new PlacaMae().setDescricao("Placa mãe").setValor(1000f).setPecas(new Parafuso().setDescricacao("parafuso"))
            )
            .setComponents(
                    new Processador().setDescricao("Processador").setValor(500f).setPecas(new Parafuso().setDescricacao("parafuso"))
            )
            .setComponents(
                    new Fonte().setDescricao("Fonte").setValor(200f).setPecas(new Parafuso().setDescricacao("parafuso"))
            );

        Computador computador = computadorBuilder.build();
        assertEquals("Descrição: \n" +
            "Placa mãe / valor: 1000.0\n" +
            "Peças: \n" +
            "parafuso\n" +
            "\n" +
            "Processador / valor: 500.0\n" +
            "Peças: \n" +
            "parafuso\n" +
            "\n" +
            "Fonte / valor: 200.0\n" +
            "Peças: \n" +
            "parafuso\n\n",
            computador.getDescricao()
        );
    }
}
