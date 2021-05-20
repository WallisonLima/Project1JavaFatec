import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Exer02 {

	public static void main(String[] args) throws IOException {
		// 1 - Abrir o Arquivo 
		// (se nao existe e criado, se existe e reescrito)
		BufferedReader pw = new BufferedReader(new FileReader("aluno.txt"));
		String name = pw.readLine();
		if (name != null) {
			System.out.println(name);
		}
		
		// Ler TODAS AS LINHAS
		String cpf = pw.readLine();
		if (cpf != null) {
			System.out.println(cpf);
		}
	}
}
