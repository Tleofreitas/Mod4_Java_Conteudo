package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	// Construtor padrão
	public Product() {
		
	}
	
	// Construtor com argumentos
	public Product(String name, double price, int quantity) {
		/* this = referencia para o próprio objeto, diferente da
		 * variável local(escopo) do construtor.
		 */
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}	

	/* Construtor SOBRECARGA - mais de uma operação com o mesmo nome,
	 * porém com diferentes listas de parâmetros. 
	 */
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
