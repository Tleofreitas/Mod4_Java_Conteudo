import java.util.Locale;
import java.util.Scanner; // Importa��o para ler dados

public class Senha_Fixa {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); // Leitura dos dados		
		
		int senha;
		
		System.out.println("Digite a SENHA:");
		senha = sc.nextInt(); // Leitura do primeiro valor
		
		while (senha != 2002) {
			System.out.print("Senha Inv�lida! Tente novamente: ");
			senha = sc.nextInt(); // Leitura do segundo valor
		}
		
		System.out.println("Acesso permitido!");
		sc.close(); // Encerra leitura de dados		
	}		
}
