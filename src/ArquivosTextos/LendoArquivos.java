package ArquivosTextos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LendoArquivos {
    public static void main (String[] args)throws IOException{
        Path arquivos = Paths.get("C:\\Users\\Pichau\\Desktop\\Testando\\textProg.txt");

        Files.readAllLines(arquivos);
    }

}
