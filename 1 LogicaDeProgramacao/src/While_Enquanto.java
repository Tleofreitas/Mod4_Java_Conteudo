import java.util.Scanner; // Importação para ler dados

public class While_Enquanto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Leitura dos dados
		
		int x = sc.nextInt(); // Leitura do primeiro valor
		
		// Estrutura enquanto x diferente de 0
		while (x != 0) {
			x = sc.nextInt();
		}

		sc.close(); // Encerra leitura de dados
	}

}
