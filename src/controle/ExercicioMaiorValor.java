package controle;

import java.util.Scanner;

public class ExercicioMaiorValor {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero, maior = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();
			
			if (numero > maior) {
				maior = numero;
			}
		}
		
		System.out.printf("O maior valor digitado foi: %d", maior);
		
		entrada.close();
	}
}
