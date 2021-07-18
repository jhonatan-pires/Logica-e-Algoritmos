package Cerveja;

public class ReporEstoque {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();
        estoque.cerveja = "skol";
        estoque.vodka = 10;

        estoqueDosProdutosConsumidos(estoque);

    }
    static void estoqueDosProdutosConsumidos(Estoque estoque){
        if (estoque.vodka >= 10){
            System.out.println("estoque:" +  estoque.cerveja + "possui:" + estoque.vodka + "Precisa repor estoque!");
        }else{
            System.out.println("estoque:" +  estoque.cerveja + "possui:" + estoque.vodka + "Não Precisa repor estoque!");
        }

    }
}
