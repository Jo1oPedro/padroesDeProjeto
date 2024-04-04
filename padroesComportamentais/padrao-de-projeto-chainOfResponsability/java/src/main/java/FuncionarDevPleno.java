public class FuncionarDevPleno extends Funcionario{
    public FuncionarDevPleno(Funcionario superior) {
        listaProblemas.add("bug medio");
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Dev pleno";
    }
}
