public class FuncoesPara_String {
	
public static void main(String[] args) {		
				
		String original = "abcde FGHIJ ABC abc DEFG ";
		
		String s01 = original.toLowerCase(); // Conversão da String para letras minusculas
		String s02 = original.toUpperCase(); // Conversão da String para letras maiusculas
		String s03 = original.trim();        // Elimina espaços nos cantos da String
		String s04 = original.substring(2);  // Caracteres da posição 2 em diante
		String s05 = original.substring(2, 9); // Caracteres da posição 2 até a 9
		String s06 = original.replace('a', 'x'); // Troca um caracter por outro, a por x no exemplo
		String s07 = original.replace("abc", "xy"); // Troca uma seleção de caracteres por outro, abc por xy no exemplo
		int i = original.indexOf("bc");            // Primeira ocorrência (posição) dos caracteres
		int j = original.lastIndexOf("bc");       // Última posição dos caracteres
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
	}	

}
