package ArquivosTextos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FilesText {
    public static void main(String[] args) throws IOException {
        ArrayList <String> Linhas = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: " + Linhas);
        for (int i = 0; i < 10; i++){
            String nome = scanner.nextLine();
            Linhas.add(nome);
        }
        Path arquivos = Paths.get("C:\\Users\\Pichau\\Desktop\\Testando\\textProg.txt");

        scanner.close();
        Files.write(arquivos, Linhas);

    }
}
