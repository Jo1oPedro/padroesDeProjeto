public abstract class CorpoCelesteDecorator implements ICorpoCeleste {

    private ICorpoCeleste corpoCeleste = null;
    public CorpoCelesteDecorator(ICorpoCeleste corpoCeleste) {
        this.corpoCeleste = corpoCeleste;
    }

    public abstract float getPeso();

    @Override
    public float getMassaTotal() {
        return this.corpoCeleste.getMassaTotal() + this.getPeso();
    }


    public abstract String getNomeEstrutura();
    @Override
    public String getEstrutura() {
        return this.getNomeEstrutura() + "/" + this.corpoCeleste.getEstrutura();
    }
}
