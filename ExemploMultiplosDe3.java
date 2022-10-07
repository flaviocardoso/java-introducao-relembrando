package src;

public class ExemploMultiplosDe3 {
	public static void main(String[] args) {
		System.out.print("Multiplos de 3 com modulo: ");
		
		
		for (int numero = 1; numero <= 100; numero++) {
			if (numero % 3 == 0) {
				System.out.print(numero + " ");
			}
		}
		
		System.out.println();
		System.out.print("Multiplos de 3: ");
		for (int numero = 3; numero < 100; numero+=3) {
			System.out.print(numero + " ");
		}
	}

}
