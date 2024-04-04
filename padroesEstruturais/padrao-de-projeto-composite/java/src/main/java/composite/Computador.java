package composite;

import composite.Componentes.Componente;

import java.util.ArrayList;
import java.util.List;

public class Computador {
    private List<Componente> componentes = new ArrayList<Componente>();

    public Computador setComponents(Componente componente) {
        this.componentes.add(componente);
        return this;
    }

    public String getDescricao() {
        StringBuilder saida = new StringBuilder("Descrição: \n");
        for(Componente componentes : this.componentes) {
            saida.append(componentes.getDescricao()).append("\n");
        }

        return saida.toString();
    }

    public List<Componente> getComponents() {
        return this.componentes;
    }
}
