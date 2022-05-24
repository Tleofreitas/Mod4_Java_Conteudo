package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		/*
		 * Cria/recria o arquivo: new FileWriter(path) Acrescenta ao arquivo
		 * inexixteste: new FileWriter(path, true)
		 * 
		 * BufferedWriter - Otimizações para o FileReader
		 */

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

		String path = "c:\\temp\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
