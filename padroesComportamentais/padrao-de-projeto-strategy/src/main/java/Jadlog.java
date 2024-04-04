public class Jadlog implements FormaEnvio {

    @Override
    public float calculaPrecoEnvio(float origem, float destino) {
        return (origem - destino) * 20;
    }
}
