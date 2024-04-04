package composite.builders;

import composite.Componentes.Componente;
import composite.Componentes.Fonte;
import composite.Componentes.PlacaMae;
import composite.Componentes.Processador;
import composite.Computador;

public class ComputadorBuilder {

    private Computador computador = null;

    public ComputadorBuilder() {
        this.computador = new Computador();
    }

    public Computador build() {
        boolean contemPlacaMae = false;
        boolean contemProcessador = false;
        boolean contemFonte = false;

        if(this.computador.getComponents().isEmpty()) {
            throw new IllegalArgumentException("Computador sem peças");
        }

        for (Componente componente : this.computador.getComponents()) {
            if (componente instanceof PlacaMae) {
                contemPlacaMae = true;
            } else if (componente instanceof Processador) {
                contemProcessador = true;
            } else if (componente instanceof Fonte) {
                contemFonte = true;
            }
        }

        if(!contemPlacaMae || !contemProcessador || !contemFonte) {
            throw new IllegalArgumentException("Computador incompleto");
        }

        return this.computador;
    }

    public ComputadorBuilder setComponents(Componente componente) {
        this.computador.setComponents(componente);
        return this;
    }
}
