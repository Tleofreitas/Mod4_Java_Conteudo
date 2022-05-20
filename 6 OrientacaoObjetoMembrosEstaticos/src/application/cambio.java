package application;

import util.Cambio;
import java.util.Locale;
import java.util.Scanner;

public class cambio {

	public static void main(String[] args) {
		
		/*Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma
		pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a
		pessoa terá que pagar 6% de IOF sobre o valor em dólar.
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o preço do dólar? ");
		double dolar = sc.nextDouble();
		
		System.out.print("Quantos dólares serão comprados? ");
		int quantia = sc.nextInt();
		
		double conversao = Cambio.dolarParaReal(dolar, quantia);
		
		System.out.printf("Valor a ser pago em reais = %.2f%n", conversao);
		
		sc.close();
	}

}
