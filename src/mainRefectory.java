public class mainRefectory {
    public static void main(String[] args) {

        pedido novoPedido = new pedido();
        novoPedido.criarPedido();

        System.out.println(novoPedido.valor);

        novoPedido.
                adicionarItem(1, 10, 2);
        novoPedido.
                adicionarItem(2, 11, 4);
        novoPedido.
                adicionarItem(3, 12, 6);


                System.out.println("total pedido : " + novoPedido.valor);
    }
}
