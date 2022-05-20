package entities;

public class Product {

	// Private para encapsulamento
	// O membro n�o pode ser acessado em uma classe diferente
	private String name;
	private double price;
	private int quantity;

	public Product() {
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// pegar o nome
	public String getName() {
		return name;
	}

	// alterar o nome
	public void setName(String name) {
		this.name = name;
	}
	
	// pegar o pre�o
	public double getPrice() {
		return price;
	}

	// alterar o pre�o
	public void setPrice(double price) {
		this.price = price;
	}

	// retorna a quantidade
	public int getQuantity() {
	return quantity;

	}	
}
