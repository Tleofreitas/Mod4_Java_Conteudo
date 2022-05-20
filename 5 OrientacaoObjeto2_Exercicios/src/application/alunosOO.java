package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class alunosOO {

	public static void main(String[] args) {
		
		/*
		Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve nos tr�s trimestres do
		ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota
		final do aluno no ano. Dizer tamb�m se o aluno est� aprovado (APROVADO) ou n�o (REPROVADO)
		e, em caso negativo, quantos pontos faltam para o aluno obter o m�nimo para ser aprovado (que � 60%
		da nota).
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Alunos alunos = new Alunos();
		
		System.out.println("Entre com o nome do aluno e as tr�s notas:");
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
