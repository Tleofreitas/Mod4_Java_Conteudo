package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		// Exemplo com fun��o RemoveIf
		
		// Fazer um programa que, a partir de uma lista de produtos, remova da
		// lista somente aqueles cujo pre�o m�nimo seja 100.
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// Remover elemento da lista maior que 100
		// list.removeIf(p -> p.getPrice() >= 100);
		
		// SOLU��O Implementa��o da Interface
		// list.removeIf(new ProductPredicate());
		
		// SOLU��O Reference method com m�todo est�tico
		// list.removeIf(Product::staticProductPredicate);
		
		// SOLU��O Reference method com m�todo est�tico
		// list.removeIf(Product::nonStaticProductPredicate);
		
		// SOLU��O Express�o lambda declarada
		// double min = 100.0;
		// Predicate<Product> pred = p -> p.getPrice() >= min;
		// list.removeIf(pred);
		
		// SOLU��O Express�o lambda inline
		double min = 100.0;
		list.removeIf(p -> p.getPrice() >= min);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
