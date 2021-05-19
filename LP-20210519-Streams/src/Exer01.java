import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Exer01 {

	public static void main(String[] args) throws IOException {
		// 1 - Abrir o Arquivo 
		// (se nao existe e criado, se existe e reescrito)
		PrintWriter pw = new PrintWriter(new FileWriter("aluno.txt", true));
		//                                         modo de anexasao ---^
		// (se nao existe e criado, se existe ocorre anexasao)
		// 2 - Escrever no Arquivo
		String name = "";
		name = writeText("Digite seu nome", name);
		
		String cpf = "";
		cpf = writeText("Digite seu CPF", cpf);
		
		pw.println("Nome: " + name);
		pw.println("CPF: " + cpf);
		
		// 3 - Fechar o Arquivo
		pw.close();
	}
	
	public static  String writeText(String text, String var) {
		Scanner sc = new Scanner(System.in);
		System.out.println(text + ": ");
		var = sc.nextLine();
		return var;
	}

}
