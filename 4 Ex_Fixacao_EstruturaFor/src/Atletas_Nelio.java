import java.util.Locale;
import java.util.Scanner;

public class Atletas_Nelio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, contHomens, contMulheres;
		String nome, nomeMaisAlto;
		double peso, altura, somaPesos, maiorAltura, somaAlturaMulheres;
		char sexo;

		System.out.print("Qual a quantidade de atletas? ");
		N = sc.nextInt();
		
		contHomens = 0;
		contMulheres = 0;
		maiorAltura = 0;
		nomeMaisAlto = "";
		somaPesos = 0.0;
		somaAlturaMulheres = 0.0;

		for (int i = 0; i < N; i++) {
			
			// LEITURA DOS DADOS DO ATLETA i
			
			System.out.println("Digite os dados do atleta numero " + (i+1) + ":");
			
			System.out.print("Nome: ");
			sc.nextLine();
			nome = sc.nextLine();
			
			System.out.print("Sexo: ");
			sexo = sc.next().charAt(0);
			while (sexo != 'F' && sexo != 'M') {
				System.out.print("Valor invalido! Favor digitar F ou M: ");
				sexo = sc.next().charAt(0);
			}
			
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			while (altura <= 0.0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				altura = sc.nextDouble();
			}
			
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			while (peso <= 0.0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				peso = sc.nextDouble();
			}

			// ACUMULANDO A SOMA DOS PESOS PARA CALCULAR A MEDIA DEPOIS
			
			somaPesos = somaPesos + peso;
			
			// ATUALIZANDO ATLETA MAIS ALTO, SE FOR O CASO
			
			if (altura > maiorAltura) {
				maiorAltura = altura;
				nomeMaisAlto = nome;
			}
			
			// ACUMULANDO A CONTAGEM DE HOMENS, SE FOR O CASO

			if (sexo == 'M') {
				contHomens = contHomens + 1;				
			}
			
			// ACUMULANDO A SOMA DAS ALTURAS E CONTAGEM DE MULHERES, SE FOR O CASO
			
			if (sexo == 'F') {
				contMulheres = contMulheres + 1;
				somaAlturaMulheres = somaAlturaMulheres + altura;
			}
		}
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		
		double pesoMedio = somaPesos / N;
		System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedio);
		
		System.out.println("Atleta mais alto: " + nomeMaisAlto);
		
		double percentHomens = (double) contHomens / N * 100.0;
		System.out.printf("Porcentagem de homens: %.1f %%%n", percentHomens);
		
		if (contMulheres == 0) {
			System.out.println("Não há mulheres cadastradas");
		}
		else {
			double media = somaAlturaMulheres / contMulheres;
			System.out.printf("Altura média das mulheres: %.2f%n", media);
		}

		sc.close();

	}

}
