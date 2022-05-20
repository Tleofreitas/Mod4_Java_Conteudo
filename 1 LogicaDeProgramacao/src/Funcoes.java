import java.util.Scanner;

public class Funcoes {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com tr�s n�meros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c); // Chama a fun��o max passando os par�metros
		
		showResultado(maior); // Chama a fun��o maior	
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) { // fun��o max
		int aux;
		if (x > y && x > z) {
			aux = x;			
		} else if (y > z) {
			aux = y;			
		} else {
			aux = z;
		}
		
		return aux; // retorna o maior ap�s o teste
	}
	
	public static void showResultado(int value) { // Fun��o imprimir resultado
		System.out.println("Maior = " + value);		
	}
}
