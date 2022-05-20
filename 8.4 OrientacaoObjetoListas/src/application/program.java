package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Maria"); // Adiciona item na lista
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); // inserido na posição 2

		System.out.println(list.size()); // Verifica tamanho da lita

		// for each
		for (String x : list) {
			System.out.println(x);
		}

		// Remover por predicado (verdadeiro ou falso)
		System.out.println("---------------------");
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}

		// Encontrar posição do elemento
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));

		// Filttrar lista
		System.out.println("---------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for (String x : result) {
			System.out.println(x);
		}

		// Filtrar primeiro elemento
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}
}
