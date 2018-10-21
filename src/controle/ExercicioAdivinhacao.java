package controle;

import java.util.Scanner;

public class ExercicioAdivinhacao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int aleatorio = 97, numero;
		
		
		for (int i = 9; i >= 0; i--) {
			System.out.println("Que número está na memória? ");
			numero = entrada.nextInt();
			
			if (numero == aleatorio) {
				System.out.println("Você acertou o número, parabéns!");
				break;
				
			} else if (numero < aleatorio) {
				System.out.println("Número menor que o da memória! Você ainda tem " + i + " tentativas.");
				
			} else {
				System.out.println("Número maior que o da memória! Você ainda tem " + i + " tentativas.");
			}
		}
		
		entrada.close();
	}
}
