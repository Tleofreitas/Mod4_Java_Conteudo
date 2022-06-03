package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product>{

	// SOLU��O Implementa��o da Interface
	// M�todo Teste
	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}
}
