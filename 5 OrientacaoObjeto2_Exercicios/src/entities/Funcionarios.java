package entities;

public class Funcionarios {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentoSalario(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100;		
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", salarioLiquido());			
	}

}
