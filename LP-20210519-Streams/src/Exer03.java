import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Exer03 {

	public static void main(String[] args) {
		String name = "";
		name = writeText("Digite seu nome: ", name);
		String ra = "";
		ra = writeText("Digite seu RA: ", ra);
		
		String desktopPath = System.getenv("HOME") + "/Área de Trabalho/aluno";
		
		try {
            // false --> reescrita, cria se n�o existe; abre e apaga se existe
            // true  --> anexa��o, cria se n�o existe; abre e completa se existe
            BufferedWriter bw = 
                    new BufferedWriter(
                        new FileWriter(desktopPath + ".html", false));
            System.out.println("Arquivo '" + desktopPath + "' aberto.");
            System.out.println("Gerando conteudo...");
            String line = "<html>\n<head><title>Exer03 - Alunos</title></head>\n";
            bw.write(line, 0, line.length());
            
            line = "<body>\n<h1>" + name + "</h1><table border='1'>\n";
            bw.write(line, 0, line.length());
            
            line = "<h2>" + ra + "</h2>\n";
            bw.write(line, 0, line.length());
            
            line = "</table>\n</body>\n</html>\n";
            bw.write(line, 0, line.length());
            System.out.println("Geracao finalizada.");
            //
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro1:" + e);
            System.exit(-1);
        } catch (IOException e) {
            System.out.println("Erro2:" + e);
            System.exit(-1);
        } 
        System.out.println("Arquivo '" + desktopPath + "' fechado.");
    };
	
	public static  String writeText(String text, String var) {
		Scanner sc = new Scanner(System.in);
		System.out.println(text);
		var = sc.nextLine();
		return var;
	}
}
