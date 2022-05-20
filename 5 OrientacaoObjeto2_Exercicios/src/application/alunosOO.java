package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class alunosOO {

	public static void main(String[] args) {
		
		/*
		Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do
		ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota
		final do aluno no ano. Dizer também se o aluno está aprovado (APROVADO) ou não (REPROVADO)
		e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60%
		da nota).
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Alunos alunos = new Alunos();
		
		System.out.println("Entre com o nome do aluno e as três notas:");
		alunos.nome = sc.next();
		alunos.n1 = sc.nextDouble();
		alunos.n2 = sc.nextDouble();
		alunos.n3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL: %.2f%n", alunos.notaFinal());
		
		if (alunos.notaFinal() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("FALTARAM %.2f PONTOS%n", alunos.pontosFaltantes());
		}
		else {
			System.out.println("APROVADO");
		}
		
		sc.close();
	}

}
