public class Importadora {
    public static String formula = "precoProduto + pesoProduto * 2";

    public static double calcularImposto(double preco, double peso) {
        String expressao;
        expressao = formula.replace("precoProduto", Double.toString(preco));
        expressao = expressao.replace("pesoProduto", Double.toString(peso));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
