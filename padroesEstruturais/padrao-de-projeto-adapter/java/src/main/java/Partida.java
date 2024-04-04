public class Partida {

    IDano dano = null;
    DanoAdapter danoAdapter = null;

    public Partida() {
        this.dano = new DanoNumerico();
        this.danoAdapter = new DanoAdapter(this.dano);
    }

    public Partida setDano(float avaliacao) {
        this.dano.setDano(avaliacao);
        this.danoAdapter.salvarDano();
        return this;
    }

    public String getDanoPorcentagem() {
        return danoAdapter.getDano();
    }

    public float getDanoNumerico() {
        return this.dano.getDano();
    }
}
