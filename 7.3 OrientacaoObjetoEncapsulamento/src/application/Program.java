package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);
		
		// Utilizando classe com encapsulamento
		
		// Alterar o nome (encapsulado)
		product.setName("Computer");
		
		// Exibir o nome
		System.out.println("Update name: " + product.getName());
		
		// Alterar o preço
		product.setPrice(1200.00);
		
		// Exibir o preço
		System.out.println("Update price: " + product.getPrice());
		
		sc.close();
	}

}
