package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*
		 * File - Um arquivo e seu caminho Scanner - Leitor de texto IOException -
		 * Exce��o
		 */

		File file = new File("c:\\temp\\in.txt");

		Scanner sc = null;

		// Instanciar Scanner a partir do arquivo
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
