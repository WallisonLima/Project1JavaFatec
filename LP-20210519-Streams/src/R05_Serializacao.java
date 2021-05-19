import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class R05_Serializacao {

	public static void main(String[] args) throws Exception {
		// 1 - Abrir arquivo binário
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("objetos.ser"));

		// 2 - Escrever (gravar objetos) no Arquivo
		String LP = "Linguagem de Programação";
		int[] array = {19, 5, 2021, 10, 9, 0 };
		
		oos.writeObject(LP);	// grava (serializa) string
		oos.writeObject(array); // grava (serializa) array todo
		
		// 3 - Fechar o Arquivo
		oos.close();
	}

}
