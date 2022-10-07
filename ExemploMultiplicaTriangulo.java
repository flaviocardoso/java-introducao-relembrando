package src;

public class ExemploMultiplicaTriangulo {
	public static void main(String[] args) {
		System.out.println("Formando triângulo.");
		System.out.println("Break dentro de condicional.");

		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 10; coluna++) {
				if (coluna > linha) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}

		//   0 1 2 3 4 5 6 7 8 9           false                    true
		// 0 *                     - linha = 0 | coluna = 0 - linha = 0 | coluna = 1 break
		// 1 * *                   - linha = 1 | coluna = 1 - linha = 1 | coluna = 2 break
		// 2 * * *                 - linha = 2 | coluna = 2 - linha = 2 | coluna = 3 break
		// 3 * * * *               - linha = 3 | coluna = 3 - linha = 3 | coluna = 4 break
		// 4 * * * * *             - linha = 4 | coluna = 4 - linha = 4 | coluna = 5 break
		// 5 * * * * * *           - linha = 5 | coluna = 5 - linha = 5 | coluna = 6 break
		// 6 * * * * * * *         - linha = 6 | coluna = 6 - linha = 6 | coluna = 7 break
		// 7 * * * * * * * *       - linha = 7 | coluna = 7 - linha = 7 | coluna = 8 break
		// 8 * * * * * * * * *     - linha = 8 | coluna = 8 - linha = 8 | coluna = 9 break
		// 9 * * * * * * * * * *   - linha = 9 | coluna = 9

		System.out.println("Sem break. Condição fica dentro do loop interno");
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna <= linha; coluna++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//   0 1 2 3 4 5 6 7 8 9            true
		// 0 *                    - linha = 0 | coluna = <=0 
		// 1 * *                  - linha = 1 | coluna = <=1
		// 2 * * *                - linha = 2 | coluna = <=2
		// 3 * * * *              - linha = 3 | coluna = <=3
		// 4 * * * * *            - linha = 4 | coluna = <=4
		// 5 * * * * * *          - linha = 5 | coluna = <=5
		// 6 * * * * * * *        - linha = 6 | coluna = <=6
		// 7 * * * * * * * *      - linha = 7 | coluna = <=7
		// 8 * * * * * * * * *    - linha = 8 | coluna = <=8
		// 9 * * * * * * * * * *  - linha = 9 | coluna = <=9
	}
}
