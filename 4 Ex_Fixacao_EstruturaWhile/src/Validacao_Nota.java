import java.util.Locale;
import java.util.Scanner; // Importação para ler dados

public class Validacao_Nota {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); // Leitura dos dados		
		
		double n1, n2, media;
		
		System.out.print("Digite a PRIMEIRA nota:");
		n1 = sc.nextDouble(); // Leitura do primeiro valor
		
		while (n1 < 0 || n1 > 10) {
			System.out.print("Valor inválido! Digite novamente: ");
			n1 = sc.nextDouble();			
		}
		
		System.out.print("Digite a SEGUNDA nota:");
		n2 = sc.nextDouble(); // Leitura do segundo valor
		
		while (n2 < 0 || n1 > 10) {
			System.out.print("Valor inválido! Digite novamente: ");
			n2 = sc.nextDouble();			
		}
		
		media = (n1 + n2) / 2;
			
			System.out.printf("Média: %.2f\n", media);
			sc.close(); // Encerra leitura de dados
		}		
	}		
