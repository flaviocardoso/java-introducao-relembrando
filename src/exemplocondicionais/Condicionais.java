package src.exemplocondicionais;

public class Condicionais {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int idade = 17; // variavel pode ser trocada
		
		System.out.println("Primeiro exemplo de condicional");
		if (idade >= 18) {
			System.out.println("Apecere quando for igual maior do que 18.");
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
		
		System.out.println();
		System.out.println("Segundo exemplo de condicional");
		int quantidadePessoas = 3;
		if (idade >= 18) { // maior e igual a 18
			System.out.println("Seja bem vindo - 2");
		} else {
			if (quantidadePessoas >= 2) { // maior e igual a 2
				System.out.println("Você não tem 18, mas pode entrar,"
						+ " pois está acompanhado - 2");
			} else {
				System.out.println("Infelizmente você não pode entrar - 2");
			}
		}
	}
}
