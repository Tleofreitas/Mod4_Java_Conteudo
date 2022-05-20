package application;

import java.util.Locale;
import java.util.Scanner;

public class negativos {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que leia um n�mero inteiro positivo N (m�ximo = 10) e depois
		 * N n�meros inteiros e armazene-os em um vetor. Em seguida, mostrar na tela
		 * todos os n�meros negativos lidos.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		int[] vect = new int[n];

		// i = posi��o no vetor
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}

		// Percorrer e testar vetor
		System.out.println();
		System.out.println("N�meros Negativos digitados:");

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
			sc.close();
		}
	}
}
