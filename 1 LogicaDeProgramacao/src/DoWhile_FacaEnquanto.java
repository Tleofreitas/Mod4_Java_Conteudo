import java.util.Locale;
import java.util.Scanner;

public class DoWhile_FacaEnquanto {

// Executa comandos pelo menos uma vez, testa, volta ou sai
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // para digitar numeros reais com ponto (1.2 por exemplo)
		
		Scanner sc = new Scanner(System.in); // Leitura de dados
		
		char resp;
		do {
			System.out.print("Digite a temperatura em CELSIUS: ");
			double C = sc.nextDouble();
			
			double F = 9.0 * C / 5.0 + 32.0;
			
			System.out.printf("Conversão para Fahrenheit: %.1f%n", F);
			
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);			
		} while (resp != 'n');
		
		sc.close(); // Encerra leitura dos dados
		
	}

}

