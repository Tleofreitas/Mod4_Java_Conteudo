package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {

	/*
	 * NÃO PODE fazer dessa forma: private PaypalService paymentService = new
	 * PaypalService(); Desta forma gera ALTO ACOPLAMENTO
	 */

	// Composição de objetos SERVIÇOS
	private OnlinePaymentService onlinePaymentService;

	// Injeção de Dependencia pelo construtor
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		// Valor básico do parcelamento
		double basicQuota = contract.getTotalValue() / months;
		
		// Aplicação do Juros
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
