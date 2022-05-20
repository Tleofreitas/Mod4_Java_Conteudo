import java.util.Locale;
import java.util.Scanner; // Importa��o para ler dados

public class Media_Idades {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); // Leitura dos dados		
		
		int idades, numPessoas;
		double soma, media;
		
		System.out.println("Digite as IDADES:");
		int idade = sc.nextInt(); // Leitura do primeiro valor
		
		if (idade < 0) {
			System.out.println("Imposs�vel Calcular");
		} else {
			soma = 0;
			numPessoas = 0;
			
			while (idade >= 0) {
				soma += idade;
				numPessoas++;
				idade = sc.nextInt();
			}
			
			media = soma / numPessoas;
			
			System.out.printf("M�dia: %.2f\n", media);
		}
		
		sc.close(); // Encerra leitura de dados
	}		
}
