import java.util.Scanner;

public class Funcoes {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com três números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c); // Chama a função max passando os parâmetros
		
		showResultado(maior); // Chama a função maior	
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) { // função max
		int aux;
		if (x > y && x > z) {
			aux = x;			
		} else if (y > z) {
			aux = y;			
		} else {
			aux = z;
		}
		
		return aux; // retorna o maior após o teste
	}
	
	public static void showResultado(int value) { // Função imprimir resultado
		System.out.println("Maior = " + value);		
	}
}
