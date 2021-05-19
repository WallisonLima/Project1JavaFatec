import lplib.Leitura;

public class ExemploArray01 {

	public static void main(String[] args) {
		// Obter o tamanho desejado para o array
		int tam = Leitura.inteiro("Tamanho do array");
		System.out.println("tam = " + tam);
		// Declara��o+Aloca��o do array
		int[] v = new int[tam];
		System.out.println("array foi criado com tamanho " + tam);
		// Preenchimento
		for (int i = 0; i < v.length; i++) {
			v[i] = Leitura.inteiro("Valor #" + i, 1, 10);
		}
		// Exibi��o do array
		System.out.println("Exibi��o �ndices 0.." + (v.length - 1));
		for (int i = 0; i < v.length; i++) {
			System.out.println("v[" + i + "] = " + v[i]);
		}

		System.out.println("Exibi��o �ndices " + (v.length - 1) + "..0");
		for (int i = v.length - 1; i >= 0; i--) {
			System.out.println("v[" + i + "] = " + v[i]);
		}
		System.out.println("Exibi��o �ndices pares, �mpares");
		for (int i = 0; i < v.length; i+=2) {
			System.out.println("v[" + i + "] = " + v[i]);
		}
		for (int i = 1; i < v.length; i+=2) {
			System.out.println("v[" + i + "] = " + v[i]);
		}
}

}
