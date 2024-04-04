public class Financeiro extends Setor{
    //As credoras avaliam a reputação do tomador usando o seu histórico em outras instituições e sistemas de proteção ao crédito, como o Serasa.

    private static Financeiro financeiro = null;

    private Financeiro() {};
    public static Financeiro getInstancia() {
        if(financeiro == null) {
            financeiro = new Financeiro();
        }
        return financeiro;
    }
}
