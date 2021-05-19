import lplib.Leitura;

public class ExemploMatriz03 {

	public static void main(String[] args) {
		// Solicita tamanho da matriz (mínimo = 1, máximo - 10)
		int linhas = Leitura.inteiro("Número de linhas da matriz", 1, 10);
		int colunas = Leitura.inteiro("Número de colunas da matriz", 1, 10);
		// Declara e aloca matriz de reais (linhas x colunas)
		double mat[][] = new double[linhas][colunas];
		System.out.println("Matriz (" + linhas + "x" + colunas + ") criada");
		// Preencher a matriz com números dados pelo usuário
		leMatriz(mat);
		// Exibe matriz
		exibeMatriz(mat);
	}

	public static void leMatriz(int[][] mat) {
		System.out.println("Entrada de valores");
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				mat[l][c] = Leitura.inteiro("Valor [" + l + "][" + c + "]");
			}
		}
	}

	public static void leMatriz(double[][] mat) {
		// Preencher a matriz com números dados pelo usuário
		System.out.println("Entrada de valores");
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				mat[l][c] = Leitura.real("Valor [" + l + "][" + c + "]");
			}
		}
	}

	public static void exibeMatriz(int[][] mat) {
		System.out.println("Matriz:");
		for (int l = 0; l < mat.length; l++) {
			System.out.print("| ");
			for (int c = 0; c < mat[l].length; c++) {
				System.out.printf("%5d ", mat[l][c]);
			}
			System.out.println("|");
		}
	}
	public static void exibeMatriz(double[][] mat) {
		System.out.println("Matriz:");
		for (int l = 0; l < mat.length; l++) {
			System.out.print("| ");
			for (int c = 0; c < mat[l].length; c++) {
				System.out.printf("%5.1f ", mat[l][c]);
			}
			System.out.println("|");
		}
	}
}
