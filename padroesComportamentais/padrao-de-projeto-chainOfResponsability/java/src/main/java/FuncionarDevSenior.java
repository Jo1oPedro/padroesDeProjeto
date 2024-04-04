public class FuncionarDevSenior extends Funcionario {
    public FuncionarDevSenior(Funcionario superior) {
        listaProblemas.add("bug critico");
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Dev senior";
    }
}
