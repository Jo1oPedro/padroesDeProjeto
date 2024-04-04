public class Magalu implements MarketplaceInterface{
    @Override
    public String receberReclamacao(String mensagem) {
        return "magalu recebeu a reclamacao: " + mensagem;
    }

    @Override
    public String receberSugestao(String mensagem) {
        return "magalu recebeu a sugestao: " + mensagem;
    }
}
