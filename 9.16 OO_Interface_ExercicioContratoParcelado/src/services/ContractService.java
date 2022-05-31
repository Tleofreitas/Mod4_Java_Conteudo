package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {

	/*
	 * N�O PODE fazer dessa forma: private PaypalService paymentService = new
	 * PaypalService(); Desta forma gera ALTO ACOPLAMENTO
	 */

	// Composi��o de objetos SERVI�OS
	private OnlinePaymentService onlinePaymentService;

	// Inje��o de Dependencia pelo construtor
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		// Valor b�sico do parcelamento
		double basicQuota = contract.getTotalValue() / months;
		
		// Aplica��o do Juros
		for (int i = 1; i <= months; i++) {
			double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			// Update Quota 1% = 202
			
			double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
			// Full Quota 2% = 206.04
			
			Date dueDate = addMonths(contract.getData(), i);
			
			contract.getInstallments().add(new Installment(dueDate, fullQuota));
			// Adicionar Data e Parcelas
		}
	}
	
	// Adicionar meses a uma data usando Calendar
	private Date addMonths(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		// Setar a data para
		calendar.setTime(date);
		// Adicionar a quantidade de parcelas
		calendar.add(Calendar.MONTH, N);
		// Retorna como DATA
		return calendar.getTime();		
	}
}
