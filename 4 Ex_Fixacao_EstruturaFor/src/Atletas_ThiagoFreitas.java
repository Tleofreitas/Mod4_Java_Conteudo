import java.util.Locale;
import java.util.Scanner;

public class Atletas_ThiagoFreitas {
	public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in); // Leitura dos dados
			
			int qtd, i;
			char sexo;
			String nome, nomeDoMaisALTO, zeroF;
			Double alt, peso, x, altura, pesoMedio, porcHomens, homem, mulher, altMulheres, altMedF;
			
			mulher = (double) 0;
			homem = (double) 0;
			altMulheres = (double) 0;
			altura = (double) 0;
			peso = (double) 0;
			pesoMedio = (double) 0;
			porcHomens = (double) 0;
			altMedF = (double) 0;
			nomeDoMaisALTO = null;
			zeroF = null;
			
			System.out.print("Qual a quantidade de atletas? ");
			qtd = sc.nextInt();
			
			for (i = 1; i <= qtd; i++) {
				
				System.out.printf("Digite os dados do atleta numero %d :%n", i);
				// NOME
				System.out.print("Nome: ");
				nome = sc.next();
				
				// Sexo
				System.out.print("Sexo: ");
				sexo = sc.next().charAt(0);
				
					// Validação de sexo
					while ((sexo != 'F') & (sexo != 'M')) {
						System.out.print("Valor invalido! Favor digitar F ou M: ");	
						sexo = sc.next().charAt(0);
					}
				
				// Contagem de F e M 
				if (sexo == 'F') {
					mulher += 1;
					
				} else {
					homem += 1;
				}
				
				// ALTURA
				System.out.print("Altura: ");
				alt = sc.nextDouble();
				
					// Validação de altura
					while (alt <= 0) {
						System.out.print("Valor invalido! Favor digitar um valor positivo: ");
						alt = sc.nextDouble();					
					}
				
				// Altura das Mulheres								
				if (sexo == 'F') {
					altMulheres = altMulheres + alt;					
				}
				
				// VALIDAÇÃO MAIOR ALTURA + NOME DO ATLETA
				if (alt > altura) {
					altura = alt;
					nomeDoMaisALTO = nome;					
				}
				
				// Peso
				System.out.print("Peso: ");
				x = sc.nextDouble();
				
					// Validação do Peso
					while (x <= 0) {
						System.out.print("Valor invalido! Favor digitar um valor positivo: ");
						x = sc.nextDouble();					
					}
				
				// Soma dos Pesos								
				peso = peso + x;
				
			} // Fim do For
			
			// Peso Médio				
			pesoMedio = peso / qtd;
			
			// Percentual de Homens
			porcHomens = (homem * 100) / (homem + mulher);
			
			// Altura Média Mulheres
			if (mulher == 0) {
				zeroF = "Não há mulheres cadastradas";}
			else {
				altMedF = altMulheres / mulher;						
			}			
						
			System.out.println("RELATÓRIO:");		
			System.out.printf("Peso médio dos atletas:  %.2f%n", pesoMedio);
			System.out.printf("Atleta mais alto: %s%n", nomeDoMaisALTO);
			System.out.printf("Porcentagem de homens: %.1f%%%n", porcHomens);
			
			if (mulher > 0) {
				System.out.printf("Altura média das mulheres: %.2f%n", altMedF);					
			} else {
				System.out.print(zeroF);
			}			
			
			sc.close(); // Encerra leitura de dados
		}		
}
