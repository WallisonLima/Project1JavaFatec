import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class R06_Desserializacao {

	public static void main(String[] args) throws Exception {
		// 1 - Abrir arquivo bin�rio
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("objetos.ser"));

		// 2 - Escrever (gravar objetos) no Arquivo
		String LP = (String) ois.readObject();	// l� (desserializa) string
		int[] array = (int[]) ois.readObject(); // l� (serializa) array todo
		
		System.out.println(LP);
		System.out.println(array);
		System.out.println(Arrays.toString(array));
		
		// 3 - Fechar o Arquivo
		ois.close();
	}
}
