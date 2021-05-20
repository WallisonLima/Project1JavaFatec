import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Exer04 {

    public static void main(String a[]) {
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do arquivo? ");
        String nome = sc.nextLine();
        String desktopPath = System.getenv("HOME") + "/Área de Trabalho/";
        //
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(desktopPath + nome));
            System.out.println("Arquivo '" + nome + "' aberto.");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.exit(-1);
        }
        try {
            String line;
            System.out.println("--- Conteudo ---");	
            line = br.readLine();			
            while (line != null) {			
                System.out.println(line);	
                line = br.readLine();		
            }								
            System.out.println("--- Conteudo ---");
            br.close();
            System.out.println("Arquivo '" + nome + "' fechado.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
