public class Estrela extends CorpoCelesteDecorator{
    public Estrela(ICorpoCeleste $corpoCeleste) {
        super($corpoCeleste);
    }

    @Override
    public float getPeso() {
        return 10000;
    }

    @Override
    public String getNomeEstrutura() {
        return "Estrela";
    }
}
