package application;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a
		 * média dos elementos do vetor
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			sc.nextLine();
			vect[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		
		// Imprimir Valores
		for (int i = 0; i < vect.length; i++) {
			System.out.printf(vect[i] + "  ");
		}
		
		// Imprimir SOMA
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		System.out.printf("%nSOMA = %.2f%n", sum);
		
		double average = sum / vect.length;
		
		System.out.printf("MÉDIA = %.2f%n", average);
		
		sc.close();
	}

}
