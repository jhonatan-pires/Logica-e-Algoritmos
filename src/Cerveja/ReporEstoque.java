package Cerveja;

public class ReporEstoque {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();
        estoque.cerveja = "skol";
        estoque.vodka = 10;

        System.out.println("Estoque :" + estoque.estoqueDosProdutosConsumidos());
    }
}
