package observer;

import java.util.Observable;
import java.util.Observer;

public class Usuario implements Observer {

    private String mensagemPromocao = "";

    public Usuario observaPromocao(Loja loja) {
        loja.addObserver(this);
        return this;
    }

    @Override
    public void update(Observable loja, Object arg) {
        this.mensagemPromocao = arg.toString();
    }

    public String getMensagemPromocao() {
        return this.mensagemPromocao;
    }
}
