package src.exemploenum;

public class TesteEnum0 {
	public static void main (String[] args) {
//		Thread t = new Thread(() -> System.out.println("rolando ..."));
//		t.setPriority(Thread.MAX_PRIORITY); // exemplo de enum
		
//		t.start();
		Prioridade pMin = Prioridade.MIN;
		Prioridade pMax = Prioridade.MAX;
		
		System.out.println(pMin.name()); 
		System.out.println(pMax.name());
		
		// Ordem conforme a uma lista
		System.out.println(pMin.ordinal()); // 0 - primeira posição
		System.out.println(pMax.ordinal()); // 2 - terceira posição
		
		// Valor informado - MIN = 1, MAX = 10
		// A funcão não é do proprio enum, elas foram criadas.
		// Através do contrutor que é passado os valores em cada elemento.
		// Prioridade não pode ser instânciada.
		System.out.println(pMin.getValor()); // 1
		System.out.println(pMax.getValor()); // 10
		
		System.out.println(ComEnum.MIN); 
		// 1 - Pegando valor de variável estática
		System.out.println(ComEnum.MAX); 
		// 10 - Pegando valor de variável estática
		 System.out.println(ComEnum.Prioridade.MIN.ordinal()); 
		// 0 - usando função do enum
		 System.out.println(ComEnum.Prioridade.MIN.getValor()); 
		// 1 - criando nossa própria função no enum
		 System.out.println(ComEnum.Prioridade.MAX.getValor()); 
		// 10 - criando nossa própria função no enum
		 System.out.println(ComEnum.Prioridade.MAX.name()); 
			// 10 - criando nossa própria função no enum
		
	}
}
