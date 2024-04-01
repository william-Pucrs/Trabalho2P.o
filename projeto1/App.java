import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
class App{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);
        ArrayList<Locomotiva> locomotivas = new ArrayList<>();
        
        // menu
        boolean sair = false;

        while (!sair) {
            System.out.println("\n-------------------------");
            System.out.println("Selecione uma opção:\n");
            System.out.println("1 - Ler Trens Existentes");
            System.out.println("2 - Adicionar Novo Trem");
            System.out.println("3 - Sair");
            System.out.println("-------------------------");

            int opcao = in.nextInt();
        
            switch (opcao) {
                case 1:{
                    Leitor.leArquivo(new File("bancoDeDados.csv"));
                    System.out.println(locomotivas);
                    }; break;
                        
                case 2:{
                    System.out.println("Digite o id do trem,PesoMax,NumVagoes");
                    locomotivas.add(new Locomotiva(in.nextInt(), in.nextDouble(), in.nextInt()));
                    Escritor.escreveArquivo(new File("bancoDeDados.csv"), locomotivas);
                    }; break;
                case 3: sair = true ; break;
            }
        }
        in.close();
    }
    
}