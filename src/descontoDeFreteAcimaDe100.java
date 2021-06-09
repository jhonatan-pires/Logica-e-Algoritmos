import java.util.Scanner;

public class descontoDeFreteAcimaDe100 {
    static final Integer VALOR_FRETE = 15;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor :");
        Double valorProduto = scanner.nextDouble();
        System.out.println();

        System.out.println("Digite a quantidade: ");
        Integer quantidadeDoProduto = scanner.nextInt();
        System.out.println();

        Double valorTotaldoProduto = valorProduto * quantidadeDoProduto;

        boolean freteGratis = valorProduto >= 100.0;

        Double valorFinalCompra = null;

        if (freteGratis){
            valorTotaldoProduto = valorProduto;
        }else{
            valorFinalCompra = valorTotaldoProduto + VALOR_FRETE;
        }
        System.out.println("Valor do Frete é?" + valorFinalCompra);

        scanner.close();
    }


}
