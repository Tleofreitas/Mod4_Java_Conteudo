package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class retanguloOO {

	public static void main(String[] args) {
		
		/*
		Fazer um programa para ler os valores da largura e altura de um
		retângulo. Em seguida, mostrar na tela o valor de sua área,
		perímetro e diagonal.
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com a largura e altura do retângulo: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", retangulo.area());
		System.out.printf("PERÍMETRO = %.2f%n", retangulo.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
		
		sc.close();
	}

}
