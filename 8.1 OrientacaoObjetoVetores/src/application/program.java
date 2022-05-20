package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um número inteiro N e a altura de N pessoas.
		 * Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas
		 * pessoas.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// Criar vetor
		double[] vect = new double[n];

		// i = posição no vetor
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		// Variável SOMA
		double sum = 0.0;
		
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		// Cálculo da MÉDIA
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		sc.close();
	}

}
