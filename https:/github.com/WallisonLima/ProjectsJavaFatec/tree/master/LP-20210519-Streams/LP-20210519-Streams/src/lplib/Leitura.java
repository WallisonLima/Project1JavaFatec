package lplib;

import java.util.Scanner;

public class Leitura {
	
	public static int inteiro(String prompt) {
		Scanner teclado = new Scanner(System.in);
		System.out.print(prompt + "? ");
		int aux = teclado.nextInt();
		return aux;
	}

	public static int inteiro(String prompt, int min, int max) {
		Scanner teclado = new Scanner(System.in);
		int aux;
		do {
			System.out.printf("%s [%d..%d]? ", prompt, min, max);
			aux = teclado.nextInt();
		} while (aux < min || aux > max);
		return aux;
	}

	public static double real(String prompt) {
		Scanner teclado = new Scanner(System.in);
		System.out.print(prompt + "? ");
		double aux = teclado.nextDouble();
		return aux;
	}

	public static double real(String prompt, double min, double max) {
		Scanner teclado = new Scanner(System.in);
		double aux;
		do {
			System.out.printf("%s [%f..%f]? ", prompt, min, max);
			aux = teclado.nextDouble();
		} while (aux < min || aux > max);
		return aux;
	}
}
