import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listaProblemas = new ArrayList();
    private Funcionario funcionarioSuperior;
    public Funcionario getFuncionarioSuperior() {
        return this.funcionarioSuperior;
    }

    public Funcionario setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
        return this;
    }

    public abstract String getDescricaoCargo();

    public String solucionarProblema(IProblema problema)
    {
        if(listaProblemas.contains(problema.getTipoProblema())) {
            return getDescricaoCargo();
        }

        if(funcionarioSuperior != null) {
            return funcionarioSuperior.solucionarProblema(problema);
        }

        return "Sem assinatura";
    }
}
