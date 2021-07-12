public class Vetores {
    public static void main(String[] args) {
        Double faturamento = 100.0;

        Double[] faturamentoJaneiro = new Double[] {100.0, 200.0, 300.0};
        Double[] faturamentoFev = new Double[] {200.0, 300.0, 400.0};


        Double[][] faturamentoAnual = new Double[][] {faturamentoJaneiro, faturamentoFev};

        System.out.println("Faturamento Anual" + faturamentoAnual[0][0]);
    }
}
