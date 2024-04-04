public class ClienteBancoFacade {

    public static boolean verificarPendencias(ClienteBanco clienteBanco) {
        if(Financeiro.getInstancia().verificaClientePendente(clienteBanco)) {
            return false;
        }
        if(Juridico.getInstancia().verificaClientePendente(clienteBanco)) {
            return false;
        }
        return true;
    }
}
