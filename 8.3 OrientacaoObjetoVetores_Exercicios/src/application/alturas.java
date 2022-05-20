package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alturas;

public class alturas {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
		 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também
		 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
		 * pessoas caso houver.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		Alturas[] vect = new Alturas[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:%n", i + 1);

			System.out.print("Nome: ");
			String name = sc.nextLine();

			System.out.print("Idade: ");
			int age = sc.nextInt();

			System.out.print("Altura: ");
			sc.nextLine();
			double average = sc.nextDouble();

			vect[i] = new Alturas(name, age, average);
		}

		// Cálculo de MÉDIA
		double sum = 0.0;

		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getHeight();
		}

		double average = sum / vect.length;

		System.out.println();
		System.out.printf("Altura Média = %.2f%n", average);

		// Menos de 16 anos
		int cont = 0;

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAge() < 16) {
				cont += 1;
			}
		}

		double perc = 0.0;

		perc = ((double) cont / n) * 100.0;

		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", perc);

		// Nomes dos menores
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAge() < 16.0) {
				System.out.printf("%s%n", vect[i].getName());
			}
		}
		sc.close();
	}

}
