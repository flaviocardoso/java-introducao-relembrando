package src.exemplovariaveis;

public class DoubleVariable {
	public static void main(String[] args) {
		double salario = 1245.70;
		
		System.out.println("Meu salário é " + salario);
		
//		int valor = 12.5; // err - Não pode colocar variável int com valor de ponto flutuante
//		int valor2 = 0.0; // err - Não pode colocar variável int com valor de ponto flutuante
		double teste = 125.0;
		System.out.println(teste);
//		int valor3 = teste; // err - Não pode colocar variável int com valor de ponto flutuante
		
		/*
		 * Valor da divisão
		 * */
		int divisao = 5 / 2; // valor vai ser 2
		System.out.println(divisao);
		
		double divisao2 = 5.0 / 2; // valor vai ser 2.5 - por conter um valor de double 
		System.out.println(divisao2);
	}
}
