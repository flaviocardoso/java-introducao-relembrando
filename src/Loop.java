package src;

public class Loop {
	public static void main(String[] args) {
		System.out.println("Usando while loop.");

		// o loop a variável de contador tem um escopo global
		int contador = 1;

		while (contador <= 10) {
			System.out.println("contador while n˚" + contador + ".");
			// ++contador;
			contador++;
		}

		System.out.println("A variável de contador pode ser acessada em " + contador);

		System.out.println("Usando for loop.");

		// já em for loop a variável de contador fica dentro do escopo do loop

		for (int c = 0; c <= 10; c++) {
			System.out.println("contador for n˚" + c + ".");
		}

		// System.out.print(c); // err - variável não escontrada.

	}
}
