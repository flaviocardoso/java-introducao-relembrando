package src;

public class EscopoVariavel {
	public static void main(String[] args) {
		int idade = 20;
		int quantidadePessoas = 3;
		// para resolver o problema de váriaveis dentro de escopo em condificional, 
		// colocasse as variaveis com contexto global e assim serem acessadas.
		boolean acompanhado;
		// se houver valor que não possa ser detectado, pode ser um problema. Por isso verifique se há possibilidades a mais.
		
		// variáveis que nasce dentro de condificionais, morrem dentro de condificionais
		if (quantidadePessoas >= 2) {
			// boolean acompanhado = true; // variavel nasce dentro do escopo da condicional if e morre.
			acompanhado = true;
		} else {
			// boolean acompanhado = false; // variavel nasce dentro do escopo da condifional else e morre.
			acompanhado = false;
		}
		
		System.out.println("Testando");
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
	}
}
