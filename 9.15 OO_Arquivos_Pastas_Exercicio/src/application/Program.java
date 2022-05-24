package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Criar lista com produtos
		List<Product> list = new ArrayList<>();

		// Entrar com caminho da pasta
		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();
		
		// Ajustar caminho para quando ESTIVER NO PENDRIVE
		//String sourceFileStr = ("C:\\Users\\thiago.freitas\\Desktop\\Formação Dev Moderno\\Módulo 4 - Java\\Ex9_15\\Ex.txt");

		// Passar caminho do arquivo no file
		File sourceFile = new File(sourceFileStr);

		// Caminho completo da pasta
		String sourceFolderStr = sourceFile.getParent();

		// Criação da pasta OUT com o caminho completo de sourceFolderStr
		boolean success = new File(sourceFolderStr + "\\out").mkdir();

		// Criação do arquivo SUMMARY na pasta OUT
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			// Ler o primeiro item do arquivo
			String itemCsv = br.readLine();

			// Enquanto a próxima linha não for nula continua...
			while (itemCsv != null) {

				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				// Instancia o Produto através do vetor
				list.add(new Product(name, price, quantity));

				itemCsv = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

				// Percorrer lista e imprimir
				for (Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}

				System.out.println(targetFileStr + " CREATED!");

			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		sc.close();

	}

}
