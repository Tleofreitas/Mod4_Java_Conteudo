package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Caminho onde a pasta está
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		// Cada pasta será um item do vetor
		File[] folders = path.listFiles(File::isDirectory);

		System.out.println();
		System.out.println("FOLDERS:");

		// Imprimir na tela a lista de folders
		for (File folder : folders) {
			System.out.println(folder);
		}

		// Cada arquivo será um item do vetor
		File[] files = path.listFiles(File::isFile);

		System.out.println();
		System.out.println("FILES:");

		// Imprimir na tela a lista de folders
		for (File file : files) {
			System.out.println(file);
		}
		
		// Criar uma pasta dentro da pasta da linha 13/14 (subpasta)
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);

		sc.close();
	}
}
