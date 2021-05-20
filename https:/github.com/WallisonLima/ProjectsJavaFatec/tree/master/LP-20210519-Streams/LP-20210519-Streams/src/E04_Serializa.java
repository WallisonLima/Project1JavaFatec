import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Scanner;

public class E04_Serializa {

    public static void main(String a[]) {
        //
        Scanner tecl = new Scanner(System.in);
        System.out.print("Nome do arquivo? ");
        // leitura do nome do arquivo a ser criado
        String nome = tecl.nextLine();
        //
        try {
            ObjectOutputStream oos = 
                    new ObjectOutputStream(
                        new FileOutputStream(nome));
            System.out.println("Arquivo '" + nome + "' aberto.");
            System.out.println("Gerando conteudo...");
            Produto p = new Produto("Nome do Produto", 123456);
            oos.writeObject(p);
            System.out.println(p);
            Date d = new Date();
            oos.writeObject(d);
            System.out.println(d);
            //
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.exit(-1);
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Arquivo '" + nome + "' fechado.");
    }
}
