package src.exemploforloop;

public class ExemploMultiplica {
	public static void main(String[] args) {
		System.out.println("Tabuada.");
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			System.out.print("Multiplicador " + ((multiplicador < 10) ? "0" : "") + multiplicador + ") ");
			for (int contador = 1; contador <= 10; contador++) {
				System.out.print(((multiplicador < 10) ? "0" : "") + multiplicador + " * " + contador + ":"
						+ " [" + ((multiplicador * contador >= 10) ? "" : 0) + multiplicador * contador + "] |");
			}
			System.out.println();
		}
	}
}
