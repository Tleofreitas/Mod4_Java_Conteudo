package entities;

public class Bill {
	
	public char gender; // Sexo
	public int beer; // Cerveja
	public int barbecue; // Espetinhos
	public int softDrink; // Refrigerantes
	
	// Valor do couvert
	public double cover() {
		double cover;
		if (feeding() > 30) {
			cover = 0.0;			
		} else {
			cover = 4.0;
		}
		return cover;
	}
	
	// Valor do consumo
	public double feeding() {
		return (5.0 * beer) + (3.0 * softDrink) + (7.0 * barbecue);
	}
	
	// Valor do ticket(ingresso)
	public double ticket() {
		Double ticket = 0.0;
		if (gender == 'M') {
			ticket = (double) 10;				
		} else {
			ticket = 8.0;
		}
		return ticket;
	}
	
	// Valor Total
	public double total() {
		return cover() + feeding() + ticket();
	}
	
	// Relatório
	public String toString() {
		String coverFinal;
		if (cover() == 0.0) {
			coverFinal = "Isento de Couvert";
		} else {
			coverFinal = "Couvert = R$ " + String.format("%.2f", cover());
		}
		
		return "\r\nRELATÓRIO:\r\n" +
				"Consumo = R$ " + String.format("%.2f%n", feeding()) +
				coverFinal + "\r\n" + 
				"Ingresso = R$ " + String.format("%.2f%n", ticket()) +
				"\r\n" + "Valor a pagar = " + String.format("%.2f%n", total());		
	}
}
