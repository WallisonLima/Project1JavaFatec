package lplib;

import lplib.Leitura;

public class Array {
	
	public static void leitura(int array[], String prompt) {
		for (int i = 0; i < array.length; i++) {
			array[i] = Leitura.inteiro(i + "." + prompt);
		}
	}

	public static void leitura(double array[], String prompt) {
		for (int i = 0; i < array.length; i++) {
			array[i] = Leitura.real(i + "." + prompt);
		}
	}

	public static void imprime(int array[]) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length -1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}

	public static void imprime(double array[]) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length -1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}

	public static int soma(int array[]) {
		int soma = 0;
		for (int i = 0; i < array.length; i++) {
			soma += array[i];
		}
		return soma;
	}
	
	public static double soma(double array[]) {
		double soma = 0;
		for (int i = 0; i < array.length; i++) {
			soma += array[i];
		}
		return soma;
	}
}
