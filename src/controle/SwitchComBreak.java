package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		// Definição da leitura de entrada de dados
		
		Scanner entrada = new Scanner(System.in);
		
		// Declaração de variavéis
		
		String conceito;
		int nota;
		
		// Leitura dos dados digitados
		
		System.out.println("Digite sua nota: ");
		nota = entrada.nextInt();
		
		// Estrutura Switch-Case
		
		switch (nota) {
		case 10:
		case 9:
			conceito = "A";
			break;
		case 8:
		case 7:
			conceito = "B";
			break;
		case 6:
		case 5:
			conceito = "C";
			break;
		case 4:
		case 3:
			conceito = "D";
			break;
		case 2:
		case 1:
			conceito = "E";
			break;
		default:
			conceito = "Nota ZERO";
			break;
		}

		System.out.printf("Conceito é: %s", conceito);
		
		entrada.close();
	}
}
