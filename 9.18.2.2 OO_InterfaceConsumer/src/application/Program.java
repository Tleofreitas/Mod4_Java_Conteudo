package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		// Fazer um programa que, a partir de uma lista de produtos, aumente o
		// pre�o dos produtos em 10%.
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// Implementa��o da interface
		// list.forEach(new PriceUpdate());
		// list.forEach(System.out::println);
		
		// Reference method com m�todo est�tico
		// list.forEach(Product::staticPriceUpdate);
		// list.forEach(System.out::println);
		
		// Reference method com m�todo n�o est�tico
		// list.forEach(Product::nonStaticPriceUpdate);
		// list.forEach(System.out::println);
		
		// Express�o lambda declarada
		// double factor = 1.1;
		// Consumer <Product> cons = p -> p.setPrice(p.getPrice() * factor);
		// list.forEach(cons);
		// list.forEach(System.out::println);
		
		// Express�o lambda inline
		double factor = 1.1;
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		list.forEach(System.out::println);
	}

}
