package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		// HashSet é o mais rápido mas não garante a ordem. Não aceita repetição
		// Set<String> set = new HashSet<>();
		
		// TreeSey é lento e ordena os dados
		// Set<String> set = new TreeSet<>();
		
		// LinkedHashSet é intermediário e mantem a ordem em que os elementos foram inseridos
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		// System.out.println(set.contains("Notebook"));
		
		// Remover
		// set.remove("Tablet");
		
		// Remover de acordo com o predicado
		// set.removeIf( x -> x.length() >= 3);
		// set.removeIf( x -> x.charAt(0) == 'T');
		
		for (String p : set) {
			System.out.println(p);
		}
	}

}
