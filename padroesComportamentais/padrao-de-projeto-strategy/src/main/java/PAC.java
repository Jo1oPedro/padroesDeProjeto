public class PAC implements FormaEnvio{

    @Override
    public float calculaPrecoEnvio(float origem, float destino) {
        return ( origem - destino) * 50;
    }
}
