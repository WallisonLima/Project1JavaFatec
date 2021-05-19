import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class R01_EscritaTexto {

	public static void main(String[] args) throws IOException {
		// 1 - Abrir o Arquivo 
		// (se não existe é criado, se existe é reescrito)
		PrintWriter pw = new PrintWriter(new FileWriter("ADS-BP.txt", true));
		//                                         modo de anexação ---^
		// (se não existe é criado, se existe ocorre anexação)
		// 2 - Escrever no Arquivo
		pw.println("Análise e Desenvolvimento de Sistemas");
		System.out.println("Análise e Desenvolvimento de Sistemas");
		for(int i = 0; i < 10; i++) {
			pw.print(i + " ");
			System.out.print(i + " ");
		}
		pw.println("\nBragança Paulista");
		System.out.println("\nBragança Paulista");

		// 3 - Fechar o Arquivo
		pw.close();
	}

}
