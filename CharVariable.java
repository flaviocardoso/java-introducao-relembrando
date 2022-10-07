package src;

public class CharVariable {
	public static void main(String[] args) {
		char letra = 'a';
		System.out.println(letra); // print - a
		
		char valor = 65; // ascii
		System.out.println(valor); // print - A
		
		// valor = valor + 1; // err
		
		valor = (char) (valor + 1);
		System.out.println(valor); // print - B
		
		String frase = "Aprender Java pode ser complicado :D";
		System.out.println(frase);
		
		// concatenação
		frase = frase + 1000;
		System.out.println(frase);
		
	}
}
