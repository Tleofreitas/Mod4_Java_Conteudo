import java.util.Locale;
import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base, altura, area, perimetro, diagonal;
		
		System.out.print("Digite a base do triangulo: ");
		base = sc.nextDouble();
		
		System.out.print("Digite a altura do triangulo: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		perimetro = 2 * (base + altura);
		diagonal = Math.sqrt(base * base + altura * altura);
		
		System.out.printf("AREA = %.4f\n", area);
		System.out.printf("PERIMETRO = %.4f\n", perimetro);
		System.out.printf("DIAGONAL = %.4f\n", diagonal);
	}

}
