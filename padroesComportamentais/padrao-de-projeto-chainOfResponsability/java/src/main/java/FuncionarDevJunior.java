public class FuncionarDevJunior extends Funcionario{
    public FuncionarDevJunior(Funcionario superior) {
        listaProblemas.add("bug simples");
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Dev junior";
    }
}
