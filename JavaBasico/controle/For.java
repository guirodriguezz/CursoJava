package controle;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double somaDasNotas = 0;
		double nota = 0;

		for (int i = 0; i < 3; i++) {   // Inicializa��o, Condi��o e Itera��o
			
			System.out.println("Digite sua nota: ");   // Corpo
			nota = entrada.nextDouble();

			somaDasNotas += nota;
		}

		System.out.printf("A m�dia �: %.2f", somaDasNotas / 3);
		
		entrada.close();
	}
}
