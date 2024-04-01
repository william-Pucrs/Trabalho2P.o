import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Leitor {

    public static ArrayList<Locomotiva> leArquivo(File arquivo){
        ArrayList<Locomotiva> locomotivas = new ArrayList<>();
        try {
            Scanner inputScanner = new Scanner (arquivo);
            //uma , ou uma nova linha
            inputScanner.useDelimiter("[,\\s]");
            inputScanner.useLocale(Locale.ENGLISH);
            boolean verifica = true;
            while (inputScanner.hasNext() && verifica) {
                if(inputScanner.hasNextInt()){
                    int id  = inputScanner.nextInt();
                    System.out.println(id);
                    if( inputScanner.hasNextDouble() ){
                        double peso = inputScanner.nextDouble();
                        System.out.println(peso);
                        if(inputScanner.hasNextInt()){
                            int maxVagoes = inputScanner.nextInt();
                            System.out.println(maxVagoes);
                            locomotivas.add(new Locomotiva(id, peso, maxVagoes));
                        }else verifica = false;

                   }else verifica = false;
                
                }else verifica = false;
                
                if(inputScanner.hasNext()){
                    inputScanner.next();
                }
            }
            inputScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
            e.printStackTrace();
        }
       
        return locomotivas;
    }
    
}
