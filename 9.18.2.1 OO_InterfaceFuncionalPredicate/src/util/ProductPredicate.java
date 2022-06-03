package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product>{

	// SOLUÇÃO Implementação da Interface
	// Método Teste
	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}
}
