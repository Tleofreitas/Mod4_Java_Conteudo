package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		/*
		 * Faça um programa para ler um arquivo contendo funcionários (nome e salário) no
		 * formato .csv, armazenando-os em uma lista. Depois, ordenar a lista por nome e mostrar
		 * o resultado na tela. Nota: o caminho do arquivo pode ser informado "hardcode".
		 */
		
		List<Employee> list = new ArrayList<>();
		String path = "C:\\Users\\thiago.freitas\\Desktop\\Formação Dev Moderno\\Módulo 4 - Java\\9_15_IntComparable\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			
			// Ordenar a coleção
			Collections.sort(list);
			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
