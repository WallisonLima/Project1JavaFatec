
public class ExemploMatriz01 {

	public static void main(String[] args) {
		// criar uma matriz 2 x 2 de inteiros
		// 2 linhas por 2 colunas (duas dimensões)
		int[][] matriz = new int[2][2];
		//     l  c
		matriz[0][0] = 0;
		matriz[0][1] = 1;		
		matriz[1][0] = 2;
		matriz[1][1] = 3;
		
		// exibe como lista de valores
		// para navegar (percorrer) uma matriz
		// um for aninhado para cada dimensão
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				System.out.println("matriz[" + l + "]["
						+ c + "] = " + matriz[l][c]);
			}
		}
	}

}
