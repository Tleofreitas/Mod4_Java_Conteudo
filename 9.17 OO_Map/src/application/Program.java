package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {

		// HashMap � o mais r�pido mas n�o garante a ordem. N�o aceita repeti��o

		// TreeMap mais lento, ordena os dados

		// LinkedHashMap � intermedi�rio e mantem a ordem em que os elementos foram
		// inseridos

		Map<String, String> cookies = new TreeMap<>();
		
		// Inserindo chave e valor
		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99771122");
		
		// Remover
		cookies.remove("email");
		
		// Alterar n�mero
		cookies.put("phone", "99771133");
		
		// Verificar se tem a chave
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		
		// Coletar valor da chave
		System.out.println("Phone number: " + cookies.get("phone"));
		
		// Teste para pegar valor que n�o existe
		System.out.println("Email: " + cookies.get("email"));
		
		// Tamanho do conjunto
		System.out.println("Size: " + cookies.size());
		
		System.out.println("ALL COOKIES:");
		
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}
