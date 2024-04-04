package racas;

import classes.Classe;

public class Anao extends Raca {

    private static final float PODER_BASE = 800;
    public Anao(Classe classe) {
        super(classe);
    }

    @Override
    public float calculaPoder() {
        return PODER_BASE * this.getClasse().getPoderBase();
    }
}
