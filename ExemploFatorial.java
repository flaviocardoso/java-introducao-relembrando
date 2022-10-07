package src;

public class ExemploFatorial {
	public static void main(String[] args) {
		System.out.println("Fatorial 0-10");
		
		System.out.println("Fatorial (0)!: " + 1);
		int n = 1;
		
		for (int i = 1; i <= 10; i++) {
			n *= i;
			System.out.println("Fatorial (" + i + ")!: " + n);
		}
		
		// System.out.println(n);
		
	}
}
