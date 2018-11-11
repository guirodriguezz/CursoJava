package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double somaDasNotas = 0;
		int numeroDeNotas = 0;
		
		double nota = 0;   // Inicialização
		
		do {
			System.out.println("Digite sua nota: ");  // Corpo
			nota = entrada.nextDouble();
			
			if (nota <= 10 && nota >= 0) {
				somaDasNotas += nota;
				numeroDeNotas++;    // Iteração
			}
		} while (nota != -1);  // Condição
		
		System.out.printf("Sua média é: %.2f", somaDasNotas / numeroDeNotas);
		
		entrada.close();
	}
}
