public class Cometa extends CorpoCelesteDecorator{
    public Cometa(ICorpoCeleste $corpoCeleste) {
        super($corpoCeleste);
    }

    @Override
    public float getPeso() {
        return 500;
    }

    @Override
    public String getNomeEstrutura() {
        return "Cometa";
    }
}
