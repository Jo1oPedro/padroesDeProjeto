package observer;

import java.util.Observable;

public class Loja extends Observable {

    public void notificaPromocao(Produto produto) {
        setChanged();
        notifyObservers(produto);
    }
}
