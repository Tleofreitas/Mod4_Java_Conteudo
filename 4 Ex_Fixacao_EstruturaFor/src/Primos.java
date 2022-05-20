import java.util.Locale;
import java.util.Scanner;

public class Primos {
	
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); // Leitura dos dados		
		
		int idades, numPessoas;
		double soma, media;
		
		System.out.println("Digite um número:");
		int num = sc.nextInt(); // Leitura do primeiro valor
		
		for (int i = 2; i <= num; i++) {
			int conta = num/2;	
				if (conta > i) {
				int conta2 = num/3;
					if (conta > i) {
						int conta3 = num/5;
					}
				System.out.println(conta);		
			}
		}
		
		sc.close(); // Encerra leitura de dados		
		}
}
