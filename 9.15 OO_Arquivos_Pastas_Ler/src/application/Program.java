package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		/*
		 * FileReader - Sequência de leitura a partir de um arquivo
		 * BufferedReader - Otimizações para o FileReader 
		 */

		// Processo Atual para abrir e fechar

		String path = "c:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
