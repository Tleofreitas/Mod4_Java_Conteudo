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
		a = sc.next().charAt(0); // Caractere (caso digite mais de um, retornar� o primeiro)
				
		// System.out.println("Voc� digitou: " + x); // Atalho Sysout + ctrl espa�o	
		// System.out.println("Voc� digitou: " + y);
		// System.out.println("Voc� digitou: %.2f%n" + z);
		// System.out.println("Voc� digitou: " + a);
		
		sc.close(); // Deve ser inserido para sinalizar o fim do comando Scanner
	}

}
