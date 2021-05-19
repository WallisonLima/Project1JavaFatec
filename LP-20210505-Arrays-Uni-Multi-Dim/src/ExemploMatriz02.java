import lplib.Leitura;

public class ExemploMatriz02 {

	public static void main(String[] args) {
		// Solicita tamanho da matriz (m�nimo = 1, m�ximo - 10)
		int linhas = Leitura.inteiro("N�mero de linhas da matriz", 1, 10);
		int colunas = Leitura.inteiro("N�mero de colunas da matriz", 1, 10);
		// Declara e aloca matriz de inteiros (linhas x colunas)
		int mat[][] = new int[linhas][colunas];
		System.out.println("Matriz (" + linhas + "x" + colunas + ") criada");
		// Preencher a matriz com n�meros dados pelo usu�rio
		System.out.println("Entrada de valores");
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				mat[l][c] = Leitura.inteiro("Valor [" + l + "][" + c + "]");
			}
		}
		// Exibe matriz como tabela
		System.out.println("Matriz:");
		for (int l = 0; l < mat.length; l++) {
			System.out.print("| ");
			for (int c = 0; c < mat[l].length; c++) {
				System.out.printf("%3d ", mat[l][c]);
			}
			System.out.println("|");
		}

	}

}
