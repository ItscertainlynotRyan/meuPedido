import java.util.ArrayList;
import java.util.List;

public class pedido {


    public int numeroPedido;

    public int codigoCliente;

    public double valor;


    public List<ItemPedido> itensPedido;
    //list faz registros ilimitados

    public void criarPedido(){
        this.numeroPedido = 1;
        this.valor = 0;
        this.itensPedido = new ArrayList<>();

    }
        public  void  adicionarItem(int codigo,int quantidade,double valor){

            ItemPedido Item = new ItemPedido();
            Item.sequenciaItem = this.itensPedido.size() + 1;
            Item.codigoItem = codigo;
            Item.quantidade = quantidade;
            Item.valor = valor;

            this.valor += Item.quantidade * Item.valor;

            this.itensPedido.add(Item);
        }

}




