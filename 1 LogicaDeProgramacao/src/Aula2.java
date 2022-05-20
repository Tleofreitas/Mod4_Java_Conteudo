import java.util.Locale;

public class Aula2 {

	public static void main(String[] args) {
		
		int y = 32; //Números Inteiros
		double x = 10.35784; //Números reais
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println("Bom dia");
		
		System.out.println(y);
		
		System.out.println(x);
		System.out.printf("%.2f%n", x); //Imprime com DUAS casas decimais
		System.out.printf("%.4f%n", x); //Imprime com QUATRO casas decimais
		
		Locale.setDefault(Locale.US); // Configuração de localidade
		// para trocar , por . (padrão Estados Unidos)
		System.out.printf("%.4f%n", x); //Imprime com QUATRO casas decimais
		
		System.out.println("Resultado = " + x + " metros"); //Concatenar
		
		System.out.printf("Resultado = %.2f metros%n", x); // Concatenar com printf
		
		// %f = ponto flutuante (números reais)
		// %d = inteiro (int)
		// %S = texto (string)
		// %n = quebra de linha
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);	
	}
}
