public class FuncionarioSuporte extends Funcionario {

    public FuncionarioSuporte(Funcionario superior) {
        listaProblemas.add("erro usuario");
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Suporte";
    }
}
