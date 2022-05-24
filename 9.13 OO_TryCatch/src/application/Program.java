package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("End of program!");		
	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		
		method2();
		
		System.out.println("***METHOD1 END***");		
	}

	public static void method2() {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("***METHOD2 START***");
			System.out.println("Escreva alguns nomes: ");
			String[] vect = sc.nextLine().split(" ");
			
			System.out.print("Escreva a posi��o que deseja acessar: ");
			int position = sc.nextInt();
			
			System.out.println(vect[position]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!");
			e.printStackTrace(); // imprime a chamada de m�todos quando usamos Try Catch
			
		} catch (InputMismatchException e) {
			System.out.println("Input Error!");
		}
		
		sc.close();	
		System.out.println("***METHOD2 END***");	
	}
}

