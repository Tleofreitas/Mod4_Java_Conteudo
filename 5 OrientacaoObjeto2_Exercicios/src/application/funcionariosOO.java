package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class funcionariosOO {

	public static void main(String[] args) {
		
		/*
		Fazer um programa para ler os dados de um
		funcion�rio (nome, sal�rio bruto e imposto).
		Em seguida, mostrar os dados do funcion�rio
		(nome e sal�rio l�quido). Em seguida,
		aumentar o sal�rio do funcion�rio com base
		em uma porcentagem dada (somente o sal�rio
		bruto � afetado pela porcentagem) e mostrar
		novamente os dados do funcion�rio.
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionarios funcionarios = new Funcionarios();
		
		System.out.print("Nome: ");
		funcionarios.nome = sc.next();
		
		System.out.print("Sal�rio Bruto: ");
		funcionarios.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		funcionarios.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcion�rio: " + funcionarios);
		
		System.out.println();
		System.out.print("Qual a porcentagem para aumentar o sal�rio? ");
		double porcentagem = sc.nextDouble();
		
		funcionarios.aumentoSalario(porcentagem);
		
		System.out.println();
		System.out.println("Dados atualizados: " + funcionarios);
		
		sc.close();
	}

}
