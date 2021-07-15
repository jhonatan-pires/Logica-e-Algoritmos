package metodos;

import java.util.Scanner;

public class TerceiroMetodo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //IMPRIMIR CODIGO

        String[] nivelProgramador = new String[] {"Programador Junior", "Programador Pleno", "Programador Senior"};
        System.out.println("Qual senioridade se encaixa na categoria?");

     for (int i = 0; i < nivelProgramador.length; i++){
        System.out.println("[" + i + "]" + nivelProgramador[i]);
     }
    System.out.println("Digite sua senioridade ?");
    Integer escrevaAqui = scanner.nextInt();

    Boolean posicaoDesseSenior = escrevaAqui >= 0 && escrevaAqui < nivelProgramador.length;

    if(!posicaoDesseSenior){
        System.err.println("Posição invalida!");
        System.exit(1);
    }

    String[] seInscrevaAqui = new String[] {"Nivel Junior", "Nivel Pleno", "Nivel Senior"};
    System.out.println("SEU NIVEL ?");

    }
}
