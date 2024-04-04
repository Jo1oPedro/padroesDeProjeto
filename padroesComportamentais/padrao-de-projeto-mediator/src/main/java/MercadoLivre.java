public class MercadoLivre implements MarketplaceInterface{
    @Override
    public String receberReclamacao(String mensagem) {
        return "mercado livre recebeu a reclamacao: " + mensagem;
    }

    @Override
    public String receberSugestao(String mensagem) {
        return "mercado livre recebeu a sugestao: " + mensagem;

    }
}
