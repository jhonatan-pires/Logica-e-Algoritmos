package ArquivosTextos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class LiistaDosNomes {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeTarefas = new ArrayList<String>();

        System.out.println("Digite sua tarefa diaria: ");
        String nomeCidadao = scanner.nextLine();

        while(!nomeCidadao.equalsIgnoreCase("X")){
            System.out.println("Digite sua tarefa diaria: ");
            nomeCidadao = scanner.nextLine();
            listaDeTarefas.add(nomeCidadao);
        }

        Path arquivoUsuario = Paths.get("C:\\Users\\Pichau\\Desktop\\Testando\\textProg.txt");
        scanner.close();

        Files.write(arquivoUsuario, listaDeTarefas);
    }
}
