import java.util.Locale;
import java.util.Scanner;

public class idades {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome1, nome2;
		int idade1, idade2;
		double media;
		
		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		nome1 = sc.nextLine();
		System.out.print("Idade: ");
		idade1 = sc.nextInt();
		System.out.println("Dados da segunda pessoa:");
		System.out.print("Nome: ");
		nome2 = sc.nextLine();
		nome2 = sc.next();
		System.out.print("Idade: ");
		idade2 = sc.nextInt();
		
		media = (idade1 + idade2)/2.0;
		
		System.out.printf("A idade m�dia de %S e %S � de %.1f anos",  nome1, nome2, media);
		
	}

}
