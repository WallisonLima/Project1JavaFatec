import java.io.DataOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class R03_EscritaBinario {

	public static void main(String[] args) throws IOException {
		// 1 - Abrir o Arquivo 
		// (se não existe é criado, se existe é reescrito)
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("ADS-2021.bin"));
		
		// 2 - Escrita no Arquivo
		int quantidade = 10000;
		dos.writeInt(quantidade);
		
		for(int i=0; i<quantidade; i++) {
			dos.writeDouble(10*Math.random());
		}
		
		// 3- Fechar o Arquivo
		dos.close();
	}

}
