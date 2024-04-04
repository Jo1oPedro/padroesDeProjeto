public class Suporte {

    private static Suporte instancia;
    private Suporte() {};

    public static Suporte getInstancia() {
        if(Suporte.instancia == null) {
            Suporte.instancia = new Suporte();
        }
        return Suporte.instancia;
    }

    public String receberReclamacao(String mensagem, String marketplaceName) {
        MarketplaceInterface marketplace = MarketplaceFactory.obterMarketplace(marketplaceName);
        return "O suporte agradece seu contato.\n"+
                "O marketplace " + marketplaceName + " respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + marketplace.receberReclamacao(mensagem);
    }

    public String receberSugestao(String mensagem, String marketplaceName) {
        MarketplaceInterface marketplace = MarketplaceFactory.obterMarketplace(marketplaceName);
        return "O suporte agradece seu contato.\n"+
                "O marketplace " + marketplaceName + " respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + marketplace.receberSugestao(mensagem);
    }
}
