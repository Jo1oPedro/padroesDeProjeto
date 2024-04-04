public class Cliente {
    public String reclamar(String mensagem, String marketplace) {
        return Suporte.getInstancia().receberReclamacao(mensagem, marketplace);
    }

    public String sugerir(String mensagem, String marketplace) {
        return Suporte.getInstancia().receberSugestao(mensagem, marketplace);
    }
}
