public class Pedido {

    private FormaEnvio formaEnvio;
    public Pedido setFormaEnvio(FormaEnvio formaEnvio) {
        this.formaEnvio = formaEnvio;
        return this;
    }
    public float calculaEntrega(float origem, float destino) {
        Frete frete = new Frete(origem, destino);
        return frete.calculaFrete(this.formaEnvio);
    }
}
