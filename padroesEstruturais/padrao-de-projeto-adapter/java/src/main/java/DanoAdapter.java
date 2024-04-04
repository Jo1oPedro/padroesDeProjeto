public class DanoAdapter extends DanoPorcentagem {

    IDano avaliacaoNumerico = null;

    public DanoAdapter(IDano avaliacaoNumerico) {
        this.avaliacaoNumerico = avaliacaoNumerico;
    }

    public float recuperaDano() {
        if(this.getDano().equals("100%")) {
            return (this.avaliacaoNumerico.setDano(1000f)).getDano();
        }

        if(this.getDano().equals("50%+")) {
            return (this.avaliacaoNumerico.setDano(500f)).getDano();
        }

        if(this.getDano().equals("10%+")) {
            return (this.avaliacaoNumerico.setDano(100f)).getDano();
        }

        return this.avaliacaoNumerico.getDano();
    }

    public DanoAdapter salvarDano() {
        if(this.avaliacaoNumerico.getDano() >= 1000f) {
            this.setDano("100%");
            return this;
        }

        if(this.avaliacaoNumerico.getDano() >= 500f) {
            this.setDano("50%+");
            return this;
        }

        if(this.avaliacaoNumerico.getDano() >= 100f) {
            this.setDano("10%+");
            return this;
        }

        return this;
    }

}
