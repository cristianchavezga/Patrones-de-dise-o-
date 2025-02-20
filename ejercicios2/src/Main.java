public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        Pedido pedido1 = new PedidoParaLlevar();
        Pedido pedido2 = new PedidoEnMesa();
        Pedido pedido3 = new PedidoDomicilio(new Motorizado());

        System.out.println("Gestionando pedidos:");
        restaurante.gestionarPedido(pedido1);
        restaurante.gestionarPedido(pedido2);
        restaurante.gestionarPedido(pedido3);
    }
}