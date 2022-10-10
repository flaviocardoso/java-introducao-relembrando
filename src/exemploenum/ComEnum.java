package src.exemploenum;

public class ComEnum {
	// Diretamente implementaca nossa constantes
	public static final int MIN = 1;
	public static final int NORMAL = 5;
	public static final int MAX = 10;
	
	// Implementada através de enum dentro da classe
	public static enum Prioridade { 
		MIN(1), NORMAL(5), MAX(10);

		// Personalização 
		private int valor;

		Prioridade(int valor) {
			this.setValor(valor);
		}

		public int getValor() {
			return valor;
		}

		private void setValor(int valor) {
			this.valor = valor;
		}
	}
}
