public class Cliente {
    public double importaProduto(double preco, double peso) {
        return Importadora.calcularImposto(preco, peso);
    }
}
