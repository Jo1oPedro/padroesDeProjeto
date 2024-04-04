public class ClienteBanco {
    public boolean solicitarCredito() {
        return ClienteBancoFacade.verificarPendencias(this);
    }
}
