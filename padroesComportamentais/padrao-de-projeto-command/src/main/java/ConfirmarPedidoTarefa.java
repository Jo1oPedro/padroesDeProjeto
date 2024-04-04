public class ConfirmarPedidoTarefa implements Tarefa {

    private Pedido pedido;

    public ConfirmarPedidoTarefa(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void executar() {
        this.pedido.confirmarPedido();
    }

    @Override
    public void cancelar() {
        this.pedido.cancelarPedido();
    }
}
