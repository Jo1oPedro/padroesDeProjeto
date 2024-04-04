public class Pedido {
    private float valor;
    private String status;

    public Pedido(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public Pedido setValor(float valor) {
        this.valor = valor;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void confirmarPedido() {
        this.status = "Pedido confirmado";
    }

    public void cancelarPedido() {
        this.status = "Pedido cancelado";
    }
}
