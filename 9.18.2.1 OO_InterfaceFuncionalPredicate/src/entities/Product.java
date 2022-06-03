package entities;

public class Product {

	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	// SOLU��O Reference method com m�todo est�tico
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.0;
	}

	// SOLU��O Reference method com m�todo n�o est�tico
	public boolean nonStaticProductPredicate() {
		return price >= 100.0;
	}

		
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
}
