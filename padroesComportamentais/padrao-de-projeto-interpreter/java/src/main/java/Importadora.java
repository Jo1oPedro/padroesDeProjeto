public class Importadora {
    public static String formula = "preco + peso * 2";

    public static double calcularImposto(double preco, double peso) {
        String expressao;
        expressao = formula.replace("preco", Double.toString(preco));
        expressao = expressao.replace("peso", Double.toString(peso));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
