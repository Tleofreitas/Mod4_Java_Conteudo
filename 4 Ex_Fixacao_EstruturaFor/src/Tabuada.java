import java.util.Locale;
import java.util.Scanner; // Importação para ler dados

public class Tabuada {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); // Leitura dos dados
		
		System.out.print("Deseja a tabuaba para qual valor? ");
		int valor = sc.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			
			int resultado = valor * i;
			System.out.printf("%d x %d = %d\n", valor, i, resultado);			
		}
		
		sc.close(); // Encerra leitura de dados
	}		
}
