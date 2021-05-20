import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.Scanner;

public class E06_Desserializa {

    public static void main(String a[]) {
        //
        Scanner tecl = new Scanner(System.in);
        System.out.print("Nome do arquivo? ");
        // leitura do nome do arquivo a ser criado
        String nome = tecl.nextLine();
        //
        try {
            ObjectInputStream ois
                    = new ObjectInputStream(
                            new FileInputStream(nome));
            System.out.println("Arquivo '" + nome + "' aberto.");
            System.out.println("--- Conteudo ---");
            Produto p = (Produto) ois.readObject();
            System.out.println(p);
            Date d = (Date) ois.readObject();
            System.out.println(d);
            System.out.println("--- Conteudo ---");
            // 
            ois.close();
        } catch (FileNotFoundException | ClassNotFoundException e) {
            System.out.println(e);
            System.exit(-1);
        } catch (IOException e) {
            System.out.println(e);
        } 
        System.out.println("Arquivo '" + nome + "' fechado.");
    }
}
