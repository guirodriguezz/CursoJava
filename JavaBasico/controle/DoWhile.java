package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double somaDasNotas = 0;
		int numeroDeNotas = 0;
		
		double nota = 0;   // Inicializa��o
		
		do {
			System.out.println("Digite sua nota: ");  // Corpo
			nota = entrada.nextDouble();
			
			if (nota <= 10 && nota >= 0) {
				somaDasNotas += nota;
				numeroDeNotas++;    // Itera��o
			}
		} while (nota != -1);  // Condi��o
		
		System.out.printf("Sua m�dia �: %.2f", somaDasNotas / numeroDeNotas);
		
		entrada.close();
	}
}
