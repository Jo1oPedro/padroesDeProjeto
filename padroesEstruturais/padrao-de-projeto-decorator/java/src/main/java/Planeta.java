public class Planeta extends CorpoCelesteDecorator {
    public Planeta(ICorpoCeleste $corpoCeleste) {
        super($corpoCeleste);
    }

    @Override
    public float getPeso() {
        return 5000;
    }

    @Override
    public String getNomeEstrutura() {
        return "Planeta";
    }
}
