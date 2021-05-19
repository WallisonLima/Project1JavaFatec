import lplib.Leitura;

public class ExercicioMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Solicita tamanho da matriz A (minimo = 1, maximo - 10)
		int linhas = Leitura.inteiro("Numero de linhas da matriz A ", 1, 10);
		int colunas = Leitura.inteiro("Numero de colunas da matriz A", 1, 10);
		// Declara e aloca matriz de reais (linhas x colunas)
		double matA[][] = new double[linhas][colunas];
		System.out.println("Matriz A(" + linhas + "x" + colunas + ") criada");
		// Preencher a matriz com numeros dados pelo usuario
		leMatriz(matA);
		
		// Solicita tamanho da matriz B (minimo = 1, maximo - 10)
		// Declara e aloca matriz de reais (linhas x colunas)
		double matB[][] = new double[linhas][colunas];
		System.out.println("Matriz B(" + linhas + "x" + colunas + ") criada");
		// Preencher a matriz com numeros dados pelo usuario
		leMatriz(matB);
		
		double matC[][] = new double[linhas][colunas];
		soma(matC, matA, matB);
		exibirSoma(matC, "Soma");
		
		matC = new double[linhas][colunas];
		subtra(matC, matA, matB);
		exibirSubtra(matC, "Subtracao");
		
		
	}
	
	public static void subtra(double matC[][], double matA[][], double matB[][]) {
		for (int l = 0; l < matC.length; l++) {
			for (int c = 0; c < matC[l].length; c++) {
				matC[l][c] = matA[l][c] - matB[l][c];
			}
		}
	}
	
	public static void exibirSubtra(double[][] mat, String text) {
		System.out.println("Matriz: " + text );
		for (int l = 0; l < mat.length; l++) {
			System.out.print("| ");
			for (int c = 0; c < mat[l].length; c++) {
				System.out.printf("%5.1f ", mat[l][c]);
			}
			System.out.println("|");
		}
	}
	
	
	public static void soma(double matC[][], double matA[][], double matB[][]) {
		for (int l = 0; l < matC.length; l++) {
			for (int c = 0; c < matC[l].length; c++) {
				matC[l][c] = matA[l][c] + matB[l][c];
			}
		}
	}

	
	public static void exibirSoma(double[][] mat, String text) {
		System.out.println("Matriz: " + text);
		for (int l = 0; l < mat.length; l++) {
			System.out.print("| ");
			for (int c = 0; c < mat[l].length; c++) {
				System.out.printf("%5.1f ", mat[l][c]);
			}
			System.out.println("|");
		}
	}
		
	
	public static void leMatriz(double[][] mat) {
		// Preencher a matriz com n�meros dados pelo usu�rio
		System.out.println("Entrada de valores");
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				mat[l][c] = Leitura.real("Valor [" + l + "][" + c + "]");
			}
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
