package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerDay;
	private Double pricePerHour;
	
	private TaxService taxService;

	public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	// Gerar nota de pagamento do aluguel do veículo
	public void processInvoice(CarRental carRental) {
		// No java a data é armazenada em milesegundos
		// Usaremos t1 e t2 para pegar os milesegundos
		long t1 = carRental.getStart().getTime();
		
		long t2 = carRental.getFinish().getTime();
		// Conversao da diferença em milesegundos para hora (valor quebrado)
		double hours = (double)(t2 - t1) / 1000 / 60 / 60;
		
		// Teste para calcular valor em HORAS OU DIAS (SE > 12 = DIAS)
		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours); // Math.ceil arredonda para cima
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours / 24);
		}

		// Calcular o Imposto
		double tax = taxService.tax(basicPayment);

		// Objeto de nota de pagamento
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}