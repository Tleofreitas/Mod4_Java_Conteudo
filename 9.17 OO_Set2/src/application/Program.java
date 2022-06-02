package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		// uni�o
		Set<Integer> c = new TreeSet<>(a); // c recebe uma c�pia do conjunto a
		c.addAll(b); // adiciona todos de b
		System.out.println(c);
		
		// intersection
		Set<Integer> d = new TreeSet<>(a); // d recebe uma c�pia do conjunto a
 		d.retainAll(b); // elementos em comum dos conjuntos
		System.out.println(d);
		
		// difference
		Set<Integer> e = new TreeSet<>(a); // e recebe uma c�pia do conjunto a
		e.removeAll(b); // elementos diferentes dos conjuntos
		System.out.println(e);
	}

}
