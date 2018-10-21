package controle;

import java.util.Scanner;

public class ExercicioPar {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = entrada.nextInt();
		
		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.println("Número digitado é par!");
			} else {
				System.out.println("Número digitado é impar!");
			}
		} else {
			System.out.println("Número inválido");
		}
		
		entrada.close();
	}
}
