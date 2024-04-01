import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Escritor {
    public static void escreveArquivo(File arquivo, ArrayList<Locomotiva> locomotivas){
        try {
            PrintWriter escreve = new PrintWriter(arquivo);
        
                for (Locomotiva locomotiva : locomotivas) {
                    escreve.print(locomotiva.getIdTrem()+",");
                    escreve.print(locomotiva.getPesoMax()+ ",");
                    escreve.print(locomotiva.getMaxVagoes());
                    escreve.println( );
                }
            escreve.close(); 
        } catch (FileNotFoundException e) {
            System.out.println("arquivo não encontrado");
            e.printStackTrace();
        }
    }
}
