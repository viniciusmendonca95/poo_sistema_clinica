package principal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {
    public static void main(String[] args) {
        try {
            Path arquivo = Paths.get("arquivo.txt");
            BufferedWriter bw = null;
            
            Files.createFile(arquivo);
            bw = new BufferedWriter(new FileWriter(arquivo.toFile(), true));
            bw.write("Texto");
            bw.close();
    
        } catch (IOException ex) {
            System.out.println("Não foi possível encontrar o arquivo");
        }
    }
    
}
