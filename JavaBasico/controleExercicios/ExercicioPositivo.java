package controleExercicios;

import java.util.Scanner;

public class ExercicioPositivo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0, soma = 0;
		
		while (numero >= 0) {
			System.out.println("Digite um número inteiro: ");
			numero = entrada.nextInt();
			
			if (numero >= 0) {
				soma += numero;
				
				System.out.printf("A soma dos valores até agora é: %d \n", soma);
			}
		}
		
		System.out.println("Fim");
		
		entrada.close();
	}
}
