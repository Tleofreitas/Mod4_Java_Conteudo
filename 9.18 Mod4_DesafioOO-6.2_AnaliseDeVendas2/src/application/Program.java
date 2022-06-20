package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import entities.Sale;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Entrar com caminho da pasta
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		// C:\Users\thiago.freitas\Desktop\Formação Dev Moderno\Módulo 4 - Java\Projetos\Apoio\Ex18_D\in.csv

		// Abrir o arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Sale> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Sale(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2],
						Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));
				line = br.readLine();
			}

			// Lista de vendedores
			// Map<String, Double> vendedores = new HashMap<>(); // MAP para não permitir vendedores repetidos
			
			list.stream()
					.map(Sale::getSeller)
					.distinct()
					.forEach(System.out::println);
			
			//System.out.println(vendedores);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}

}
