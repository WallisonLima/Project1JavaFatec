import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class R04_LeituraBinario {

	public static void main(String[] args) throws IOException {
		// 1 - Abrir o Arquivo 
		// (se não existe da ERRO, se existe é LIDO)
		DataInputStream dis = new DataInputStream(new FileInputStream("ADS-2021.bin"));
		
		// 2 - Leitura no Arquivo
		int quantidade = dis.readInt();
		System.out.println(quantidade);
		
		for(int i=0; i<quantidade; i++) {
			System.out.println(dis.readDouble());
		}
		
		// 3- Fechar o Arquivo
		dis.close();
	}

}
