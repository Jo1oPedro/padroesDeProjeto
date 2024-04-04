public class Juridico extends Setor{
    private static Juridico juridico = null;

    private Juridico() {};

    public static Juridico getInstancia() {
        if(juridico == null) {
            juridico = new Juridico();
        }
        return juridico;
    }
}
