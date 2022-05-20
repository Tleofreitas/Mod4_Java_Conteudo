import java.util.Locale;
import java.util.Scanner; // Importação para ler dados

public class Crescente {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); // Leitura dos dados
		
		int x, y;
		
		System.out.println("Digite dois numeros:");
		x = sc.nextInt(); // Leitura do primeiro valor
		y = sc.nextInt(); // Leitura do segundo valor
		
		while ( x != y) {				
			if (x > y) {
				System.out.println("DECRESCENTE!");			
			} else {
				System.out.println("CRESCENTE!");
			}
			
			System.out.println("Digite outros dois numeros:");
		    x = sc.nextInt();
		    y = sc.nextInt();
		}
		sc.close(); // Encerra leitura de dados
	}

}
