package Lgica;

import java.util.Scanner;

public class Logica1 {


        public static void main(String[] args) {

            // scanner irá imprimir
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o numero");
            Double tipoAprocao = scanner.nextDouble();

            //System.out.println("Digite o numero");
            if(tipoAprocao >= 70){
                System.out.println("Aprovado" + tipoAprocao);
            }else{
                System.out.println("Reprovado pivete" + tipoAprocao);
            }
        }
}
