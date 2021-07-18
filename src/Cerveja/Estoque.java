package Cerveja;

public class Estoque {

    String cerveja;
    Integer vodka;

    Boolean estoqueDosProdutosConsumidos() {
        if (vodka >= 10) {
            System.out.println("estoque:" + cerveja + "possui:" + vodka);
            return true;
        } else{
            System.out.println("estoque:" + cerveja + "possui:" + vodka);
            return false;
        }
    }
}
