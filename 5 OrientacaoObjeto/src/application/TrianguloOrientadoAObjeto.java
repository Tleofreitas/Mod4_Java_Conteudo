package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo; // Importa a classe

public class TrianguloOrientadoAObjeto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo(); // Instanciar objeto
		y = new Triangulo();
		
		// Acessar atributos dos objetos x		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		// Acessar atributos dos objetos y
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		// Chama o Método - Função (ÁREA)
		double areaX = x.area(); 		
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
		System.out.println("Larger area: X");
		}
		else {
		System.out.println("Larger area: Y");
		}
		
		sc.close();
	}

}
