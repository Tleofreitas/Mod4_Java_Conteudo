package application;

import util.Cambio;
import java.util.Locale;
import java.util.Scanner;

public class cambio {

	public static void main(String[] args) {
		
		/*Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a ser comprado por uma
		pessoa em reais. Informar quantos reais a pessoa vai pagar pelos d�lares, considerando ainda que a
		pessoa ter� que pagar 6% de IOF sobre o valor em d�lar.
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o pre�o do d�lar? ");
		double dolar = sc.nextDouble();
		
		System.out.print("Quantos d�lares ser�o comprados? ");
		int quantia = sc.nextInt();
		
		double conversao = Cambio.dolarParaReal(dolar, quantia);
		
		System.out.printf("Valor a ser pago em reais = %.2f%n", conversao);
		
		sc.close();
	}

}
