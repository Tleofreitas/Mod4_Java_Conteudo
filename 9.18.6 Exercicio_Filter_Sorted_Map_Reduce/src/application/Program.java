package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		/* Fazer um programa para ler um conjunto de produtos a partir de um
		arquivo em formato .csv (suponha que exista pelo menos um produto).
		Em seguida mostrar o pre�o m�dio dos produtos. Depois, mostrar os
		nomes, em ordem decrescente, dos produtos que possuem pre�o
		inferior ao pre�o m�dio.. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Entrar com caminho da pasta
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		// C:\Users\thiago.freitas\Desktop\Forma��o Dev Moderno\M�dulo 4 - Java\Ex18_6\in.txt
		
		// Abrir o arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Product> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			// M�dia dos pre�os
			double avg = list.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x,y) -> x + y) / list.size();
			
			System.out.println("Average price: " + String.format("%.2f", avg));
			
			// Comparador de Strings
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			// Stram com os nomes filtrados
			List<String> names = list.stream()
					.filter(p -> p.getPrice() < avg)
					.map(p -> p.getName()).sorted(comp.reversed())
					// Ordenar de forma decrescente
					.collect(Collectors.toList());
			
			names.forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();		
	}
}