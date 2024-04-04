import java.util.ArrayList;
import java.util.List;

public abstract class Setor {
    private List<ClienteBanco> clienteBancolist = new ArrayList<ClienteBanco>();

    public void addClientePendente(ClienteBanco clienteBanco) {
        this.clienteBancolist.add(clienteBanco);
    }

    public boolean verificaClientePendente(ClienteBanco clienteBanco) {
        return this.clienteBancolist.contains(clienteBanco);
    }
}
