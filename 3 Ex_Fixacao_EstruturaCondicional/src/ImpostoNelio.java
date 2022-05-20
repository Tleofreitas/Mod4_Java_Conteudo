import java.util.Locale;
import java.util.Scanner;

public class ImpostoNelio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double rendaSalario, rendaServico, rendaGC, gastosMedicos, gastosEducacionais;
		double impostoSalario, impostoServicos, impostoGC, totalBruto, totalLiquido;
		double maximoDedutivel, gastosDedutiveis, abatimento;

		// PARTE 1: LEITURA DOS DADOS

		System.out.print("Renda anual com sal�rio: ");
		rendaSalario = sc.nextDouble();
		System.out.print("Renda anual com presta��o de servi�o: ");
		rendaServico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		rendaGC = sc.nextDouble();
		System.out.print("Gastos m�dicos: ");
		gastosMedicos = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		gastosEducacionais = sc.nextDouble();

		// PARTE 2: CALCULO DOS IMPOSTOS
		// Note que eu preferi declarar a vari�vel salarioMensal aqui, pois ela � apenas
		// um c�lculo auxiliar que s� interessa aqui neste ponto do programa

		double salarioMensal = rendaSalario / 12.0;
		if (salarioMensal < 3000.0) {
			impostoSalario = 0;
		}
		else if (salarioMensal < 5000.0) {
			impostoSalario = rendaSalario * 0.1;
		}
		else {
			impostoSalario = rendaSalario * 0.2;
		}

		impostoServicos = rendaServico * 0.15;

		impostoGC = rendaGC * 0.20;

		totalBruto = impostoSalario + impostoServicos + impostoGC;

		// PARTE 3: CALCULO DAS DEDU��ES E IMPOSTO DEVIDO

		maximoDedutivel = totalBruto * 0.3;
		gastosDedutiveis = gastosMedicos + gastosEducacionais;

		if (gastosDedutiveis > maximoDedutivel) {
			abatimento = maximoDedutivel;
		}
		else {
			abatimento = gastosDedutiveis;
		}

		totalLiquido = totalBruto - abatimento;

		// PARTE 4: EXIBI��O DO RELAT�RIO

		System.out.println();
		System.out.println("RELAT�RIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre sal�rio: %.2f%n", impostoSalario);
		System.out.printf("Imposto sobre servi�os: %.2f%n", impostoServicos);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoGC);
		System.out.println();
		System.out.println("DEDU��ES:");
		System.out.printf("M�ximo dedut�vel: %.2f%n", maximoDedutivel);
		System.out.printf("Gastos dedut�veis: %.2f%n", gastosDedutiveis);
		System.out.println();
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f%n", totalBruto);
		System.out.printf("Abatimento: %.2f%n", abatimento);
		System.out.printf("Imposto devido: %.2f%n", totalLiquido);

		sc.close();
	}
}