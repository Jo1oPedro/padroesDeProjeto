package racas;

import classes.Classe;

public class Humano extends Raca {

    private static final float PODER_BASE = 1000;
    public Humano(Classe classe) {
        super(classe);
    }

    @Override
    public float calculaPoder() {
        return PODER_BASE * this.getClasse().getPoderBase();
    }
}
