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

		System.out.print("Renda anual com salário: ");
		rendaSalario = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");
		rendaServico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		rendaGC = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		gastosMedicos = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		gastosEducacionais = sc.nextDouble();

		// PARTE 2: CALCULO DOS IMPOSTOS
		// Note que eu preferi declarar a variável salarioMensal aqui, pois ela é apenas
		// um cálculo auxiliar que só interessa aqui neste ponto do programa

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

		// PARTE 3: CALCULO DAS DEDUÇÕES E IMPOSTO DEVIDO

		maximoDedutivel = totalBruto * 0.3;
		gastosDedutiveis = gastosMedicos + gastosEducacionais;

		if (gastosDedutiveis > maximoDedutivel) {
			abatimento = maximoDedutivel;
		}
		else {
			abatimento = gastosDedutiveis;
		}

		totalLiquido = totalBruto - abatimento;

		// PARTE 4: EXIBIÇÃO DO RELATÓRIO

		System.out.println();
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
		System.out.printf("Imposto sobre serviços: %.2f%n", impostoServicos);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoGC);
		System.out.println();
		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f%n", maximoDedutivel);
		System.out.printf("Gastos dedutíveis: %.2f%n", gastosDedutiveis);
		System.out.println();
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f%n", totalBruto);
		System.out.printf("Abatimento: %.2f%n", abatimento);
		System.out.printf("Imposto devido: %.2f%n", totalLiquido);

		sc.close();
	}
}