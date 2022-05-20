import java.util.Locale;
import java.util.Scanner;

public class ImpostoThiago {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, servico, capital, medico, educacao, impSalario, impServico;
		double impCapital, impBruto, gastoDedutivel, maxDedutivel, impDevido;
		
		System.out.print("Renda anual com salário: ");
	    salario = sc.nextDouble();
	    System.out.print("Renda anual com prestação de serviço: ");
	    servico = sc.nextDouble();
	    System.out.print("Renda anual com ganho de capital: ");
	    capital = sc.nextDouble();
	    System.out.print("Gastos médicos: ");
	    medico = sc.nextDouble();
	    System.out.print("Gastos educacionais: ");
	    educacao = sc.nextDouble();
	    
	    if ((salario/12) < 3000) {
	    	impSalario = salario;	    	
	    }
	    else if ((salario/12) > 3000 && (salario/12) < 5000) {
	    	impSalario = (salario * 0.10);
	    }
	    else {
	    	impSalario = (salario * 0.20);
	    }
	    
	    impServico = ( servico > 0) ? servico * 0.15 : 0;
	    
	    impCapital = ( capital > 0) ? capital * 0.2 : 0;
	    
	    impBruto = impSalario + impServico + impCapital;
	    gastoDedutivel = medico + educacao;
	    maxDedutivel = (impBruto * 0.30);
	    impDevido = impBruto - maxDedutivel;
	    
	    System.out.println();
	    System.out.println("RELATORIO DE IMPOSTO DE RENDA");
	    System.out.println("CONSOLIDADO DE RENDA:");
	    System.out.printf("Imposto sobre salário: %.2f%n", impSalario);
	    System.out.printf("Imposto sobre serviço: %.2f%n", impServico);
	    System.out.printf("Imposto sobre ganho de capital: %.2f%n", impCapital);
	    System.out.println();
	    System.out.println("DEDUÇÕES:");
	    System.out.printf("Máximo dedutível: %.2f%n", maxDedutivel);
	    System.out.printf("Gastos dedutível: %.2f%n", gastoDedutivel);
	    System.out.println();
	    System.out.println("RESUMO:");
	    System.out.printf("Imposto bruto total: %.2f%n", impBruto);
	    System.out.printf("Abatimento: %.2f%n", maxDedutivel);
	    System.out.printf("Imposto devido: %.2f%n", impDevido);   
	}
}