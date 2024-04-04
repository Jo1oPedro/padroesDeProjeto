public class Sedex implements FormaEnvio {
    @Override
    public float calculaPrecoEnvio(float origemPacote, float enderecoCliente) {
        return (origemPacote - enderecoCliente) * 100;
    }
}
