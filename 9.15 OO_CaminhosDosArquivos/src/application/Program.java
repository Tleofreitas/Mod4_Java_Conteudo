package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		// Retorna apenas o nome do arquivo
		System.out.println("getName: " + path.getName());

		// Retorna apenas o caminho
		System.out.println("getParent: " + path.getParent());
		
		// Retorna apenas o caminho completo
		System.out.println("getPath: " + path.getPath());
		
		sc.close();

	}

}
