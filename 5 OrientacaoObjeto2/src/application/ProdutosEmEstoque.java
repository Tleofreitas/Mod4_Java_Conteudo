package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class ProdutosEmEstoque {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produtos product = new Produtos();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.nome = sc.nextLine();
		
		System.out.print("Price: ");
		product.preco = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		
		// Adicionar produtos no estoque
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.adicionarProdutos(quantity);
		System.out.println();
		
		System.out.println("Updated data: " + product);
		System.out.println();
		
		// Remover produtos do estoque
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removerProdutos(quantity);
		System.out.println();
		
		System.out.println("Updated data: " + product);		
		
		sc.close();
	}

}
