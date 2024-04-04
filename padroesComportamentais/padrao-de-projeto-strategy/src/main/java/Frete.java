public class Frete {

    private float origem;
    private float destino;

    public Frete(float origem, float destino) {
        this.origem = origem;
        this.destino = destino;
    }

    public float calculaFrete(FormaEnvio formaEnvio) {
       return formaEnvio.calculaPrecoEnvio(this.origem, this.destino);
    }
}
