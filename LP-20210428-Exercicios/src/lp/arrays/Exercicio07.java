package lp.arrays;
/* Escreva um programa que leia um arranjo com 20 valores 
 * reais e apresente em separado a soma dos valores 
 * positivos e negativos.
 */

public class Exercicio07 {

	public static void main(String[] args) {
		// arranjo de 20 elementos reais
		double arranjo[] = new double[20];
		// leitura do arranjo com LPLIB
		lplib.Array.leitura(arranjo, "Digite um real");
		// exibição do array
		lplib.Array.imprime(arranjo);
		System.out.println();
		
		// soma de positivos e negativos
		double somaPos = 0, somaNeg = 0;
		// contagem de positivos e negativos
		int contaPos = 0, contaNeg = 0;
		for (int i = 0; i < arranjo.length; i++) {
			// testa se valor é positivo ou não (negativo)
			if (arranjo[i] > 0) {
				somaPos += arranjo[i];
				contaPos++;
			} else {
				somaNeg += arranjo[i];
				contaNeg++;
			}
		}
		// exibição dos resultados
		System.out.println("Positivos:\n\tContagem = " + contaPos
				+ ", Soma = " + somaPos);
		System.out.println("Negativos:\n\tContagem = " + contaNeg
				+ ", Soma = " + somaNeg);
	}

}
