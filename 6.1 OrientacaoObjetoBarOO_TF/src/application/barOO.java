package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class barOO {

	public static void main(String[] args) {
		
		/* Em um bar, o ingresso custa 10 reais para homens e 8 reais para mulheres.
			Cada cerveja custa 5 reais, cada refrigerante 3 reais e cada espetinho custa
			7. Além disso, o bar cobra uma taxa de couvert artístico no valor de 4 reais,
			porém, se o valor gasto com consumo for superior a 30 reais, o couvert
			artístico não é cobrado. Fazer um programa para ler os seguintes dados de
			um cliente do bar: sexo (F ou M), quantidade de cervejas, refrigerantes e
			espetinhos consumidos. O programa deve então mostrar um relatório com
			a conta a ser paga pelo cliente. 
		 */
		
		Bill bill = new Bill();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int ingresso = 0;
		
		System.out.print("Sexo (F/M): ");
		bill.gender = sc.next().charAt(0);
		
			// Validação de sexo
			while ((bill.gender != 'F') & (bill.gender != 'M')) {
				System.out.print("Valor invalido! Favor digitar F ou M: ");	
				bill.gender = sc.next().charAt(0);
			}
		
		System.out.print("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
			// Validação de quantidade
			while (bill.beer < 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");	
				bill.beer = sc.nextInt();
			}
		
		System.out.print("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
			// Validação de quantidade
			while (bill.softDrink < 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");	
				bill.softDrink = sc.nextInt();
			}
		
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
			// Validação de quantidade
			while (bill.barbecue < 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");	
				bill.barbecue = sc.nextInt();
			}
			
		System.out.print(bill);
		
		sc.close();
	}

}
