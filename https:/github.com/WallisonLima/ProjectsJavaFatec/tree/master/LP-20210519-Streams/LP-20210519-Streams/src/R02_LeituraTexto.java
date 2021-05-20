import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class R02_LeituraTexto {

	public static void main(String[] args) throws IOException {
		// 1 - Abrir o Arquivo 
		// (se não existe da ERRO, se existe é lido)
		BufferedReader pw = new BufferedReader(new FileReader("ADS-BP.txt"));

		// 2 - Ler o Arquivo
		// Ler UMA LINHA
		String linha = pw.readLine();
		if (linha != null) {
			System.out.println("linha: " + linha);
		}
		
		// Ler TODAS AS LINHAS
		linha = pw.readLine();
		while (linha != null) {
			System.out.println("linha: " + linha);
			linha = pw.readLine();
		}

		// 3 - Fechar o Arquivo
		pw.close();
	}

}
