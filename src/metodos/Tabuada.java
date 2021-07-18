package metodos;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        Integer numeroRecebido = scanner.nextInt();

        imprimirTabuada(numeroRecebido, 0);
    }
    static void imprimirTabuada(Integer multiplicar , Integer multiplicacao){

        Integer resultado = multiplicar * multiplicacao;

        System.out.println(multiplicar + " X " + multiplicacao + "=" + resultado);

        if(++multiplicacao <=10 ){
            imprimirTabuada(multiplicar, multiplicacao);

        }
    }
}
