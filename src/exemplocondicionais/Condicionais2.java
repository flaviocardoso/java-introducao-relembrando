package src.exemplocondicionais;

public class Condicionais2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais.");
		
		int idade = 16;
		int quantidadePessoas = 3;
		
		System.out.println("Primeiro exemplo");
		if (idade >= 18 || quantidadePessoas >= 2) { // idade maior e igual a 18 ou quantidade de pessoas maior igual a 2
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
		
		System.out.println();
		System.out.println("Segundo exemplo2 - em variável boolean (true or false)");
		boolean acompanhando = true;
		if (idade >= 18 && acompanhando) { // idade maior e igual a 18 e boolean de acompanhado - verdadeiro ou falso
			System.out.println("Seja bem vindo - 2");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
		
		System.out.println();
		System.out.println("Terceiro exemplo");
		boolean acompanhado2 = quantidadePessoas >= 2; // condicional diretamente na variavel de boolean acompanhado2
		if (idade >= 18 && acompanhado2) {
			System.out.println("Seja bem vido - 3");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
	}
}
