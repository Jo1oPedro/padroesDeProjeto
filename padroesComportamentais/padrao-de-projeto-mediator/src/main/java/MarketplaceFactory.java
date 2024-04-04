public class MarketplaceFactory {
    private MarketplaceFactory() {}

    public static MarketplaceInterface obterMarketplace(String nomeMarketplace) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName(nomeMarketplace);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Marketplace inexistente");
        }

        if (!(objeto instanceof MarketplaceInterface)) {
            throw new IllegalArgumentException("Marketplace inválido");
        }

        return (MarketplaceInterface) objeto;
    }
}
