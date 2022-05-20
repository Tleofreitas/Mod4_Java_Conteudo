package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class funcionariosOO {

	public static void main(String[] args) {
		
		/*
		Fazer um programa para ler os dados de um
		funcionário (nome, salário bruto e imposto).
		Em seguida, mostrar os dados do funcionário
		(nome e salário líquido). Em seguida,
		aumentar o salário do funcionário com base
		em uma porcentagem dada (somente o salário
		bruto é afetado pela porcentagem) e mostrar
		novamente os dados do funcionário.
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionarios funcionarios = new Funcionarios();
		
		System.out.print("Nome: ");
		funcionarios.nome = sc.next();
		
		System.out.print("Salário Bruto: ");
		funcionarios.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		funcionarios.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionário: " + funcionarios);
		
		System.out.println();
		System.out.print("Qual a porcentagem para aumentar o salário? ");
		double porcentagem = sc.nextDouble();
		
		funcionarios.aumentoSalario(porcentagem);
		
		System.out.println();
		System.out.println("Dados atualizados: " + funcionarios);
		
		sc.close();
	}

}
