package application;

import java.util.Locale;
import java.util.Scanner;

public class soma_linhas {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler dois números inteiros M e N (máximo = 10). Em
		 * seguida, ler uma matriz de M linhas e N colunas contendo números reais. Gerar
		 * um vetor de modo que cada elemento do vetor seja a soma dos elementos da
		 * linha correspondente da matriz. Mostrar o vetor gerado.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a quantidade de linhas da matriz? ");
		int m = sc.nextInt();

		System.out.print("Qual a quantidade de colunas da matriz? ");
		int n = sc.nextInt();

		Double[][] mat = new Double[m][n];

		for (int i = 0; i < m; i++) {
			System.out.printf("Digite os elementos da %da. linha: %n", (i + 1));
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}

		double[] vetor = new double[m];

		for (int i = 0; i < m; i++) {
			Double somalinha = 0.0;

			for (int j = 0; j < n; j++) {
				somalinha = somalinha + mat[i][j];
			}
			vetor[i] = somalinha;
		}

		System.out.println("VETOR GERADO:");

		for (int i = 0; i < m; i++) {
			System.out.printf("%.1f\n", vetor[i]);
		}

		sc.close();
	}

}
