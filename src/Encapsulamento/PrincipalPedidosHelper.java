package Encapsulamento;

public class PrincipalPedidosHelper {
    public static void main(String[] args) {
        DadosPedidosFactory dadosPedidosFactory = new DadosPedidosFactory();
        dadosPedidosFactory.codigo = 00.9;
        dadosPedidosFactory.desconto = 10.0;
        dadosPedidosFactory.subtotal = 110.0;
        dadosPedidosFactory.total = 150 * (dadosPedidosFactory.subtotal/100);

        System.out.println("Pedidos: " + dadosPedidosFactory.getCodigo() + "" + dadosPedidosFactory.getDesconto() + "" + dadosPedidosFactory.getSubtotal() + "" + dadosPedidosFactory.getSubtotal());
    }
}
