package src;

public class CastingVariable {
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		
		System.out.println(valor); // print - 1270
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total); // print - 0.30000000000000004
		
		float pontFlut = 3.14f; // err - Sem o 'f' no final do número o float dá erro
		System.out.println(pontFlut);
		
		// resolvendo o problema com casting
		System.out.println((float) total);
		
		// resolvendo o problema com double (64bits), usando float(32 bits, igual a int)
		float float1 = 0.1f;
		float float2 = 0.2f;
		float floatTotal = float1 + float2;
		
		System.out.println(floatTotal);
		
		long variavelLonga = 122333000888322334L; // 64bits
		System.out.println(variavelLonga);
	}
}
