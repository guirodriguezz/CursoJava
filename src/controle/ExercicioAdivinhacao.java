package controle;

import java.util.Scanner;

public class ExercicioAdivinhacao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int aleatorio = 97, numero;
		
		
		for (int i = 9; i >= 0; i--) {
			System.out.println("Que n�mero est� na mem�ria? ");
			numero = entrada.nextInt();
			
			if (numero == aleatorio) {
				System.out.println("Voc� acertou o n�mero, parab�ns!");
				break;
				
			} else if (numero < aleatorio) {
				System.out.println("N�mero menor que o da mem�ria! Voc� ainda tem " + i + " tentativas.");
				
			} else {
				System.out.println("N�mero maior que o da mem�ria! Voc� ainda tem " + i + " tentativas.");
			}
		}
		
		entrada.close();
	}
}
