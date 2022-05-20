import java.util.Scanner; // Deve ser importado para a entrada de dados funcionar

public class Aula1 {

	public static void main(String[] args) {
		
		// Locale.setDefault(Locale.US); // Para digitar real com ponto (.)
		Scanner sc = new Scanner(System.in); // Entrada de dados do teclado
		
		String x;
		int y;
		double z;
		char a;
		
		x = sc.next(); // String
		y = sc.nextInt(); // Inteiro
		z = sc.nextDouble(); // Real
		a = sc.next().charAt(0); // Caractere (caso digite mais de um, retornará o primeiro)
				
		// System.out.println("Você digitou: " + x); // Atalho Sysout + ctrl espaço	
		// System.out.println("Você digitou: " + y);
		// System.out.println("Você digitou: %.2f%n" + z);
		// System.out.println("Você digitou: " + a);
		
		sc.close(); // Deve ser inserido para sinalizar o fim do comando Scanner
	}

}
