import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class R01_EscritaTexto {

	public static void main(String[] args) throws IOException {
		// 1 - Abrir o Arquivo 
		// (se n�o existe � criado, se existe � reescrito)
		PrintWriter pw = new PrintWriter(new FileWriter("ADS-BP.txt", true));
		//                                         modo de anexa��o ---^
		// (se n�o existe � criado, se existe ocorre anexa��o)
		// 2 - Escrever no Arquivo
		pw.println("An�lise e Desenvolvimento de Sistemas");
		System.out.println("An�lise e Desenvolvimento de Sistemas");
		for(int i = 0; i < 10; i++) {
			pw.print(i + " ");
			System.out.print(i + " ");
		}
		pw.println("\nBragan�a Paulista");
		System.out.println("\nBragan�a Paulista");

		// 3 - Fechar o Arquivo
		pw.close();
	}

}
