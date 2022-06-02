package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		// HashSet � o mais r�pido mas n�o garante a ordem. N�o aceita repeti��o
		// Set<String> set = new HashSet<>();
		
		// TreeSey � lento e ordena os dados
		// Set<String> set = new TreeSet<>();
		
		// LinkedHashSet � intermedi�rio e mantem a ordem em que os elementos foram inseridos
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
