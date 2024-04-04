package racas;

import classes.Classe;

public abstract class Raca {

    private Classe classe;
    public Raca(Classe classe) {
        this.classe = classe;
    }

    protected Classe getClasse() {
        return this.classe;
    }

    public abstract float calculaPoder();
}
