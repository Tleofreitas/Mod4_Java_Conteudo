package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer number;
	private Date data;
	private Double totalValue;

	// Lista de QUANTIDADE DE PARCELAS e suas DATAS
	List<Installment> installments = new ArrayList();

	public Contract() {
	}

	public Contract(Integer number, Date data, Double totalValue) {
		super();
		this.number = number;
		this.data = data;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
}
