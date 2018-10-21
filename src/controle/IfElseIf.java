package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double nota;

		System.out.println("Digite sua nota: ");
		nota = entrada.nextDouble();

		if (nota >= 9) {
			System.out.println("Quadro de honra!");

		} else if (nota >= 7) {
			System.out.println("Aprovado!");

		} else if (nota >= 5.5) {
			System.out.println("Recuperação!");

		} else if (nota >= 3.5) {
			System.out.println("Recuperação + trabalho");

		} else {
			System.out.println("Reprovado!");
		}
		
		entrada.close();
	}
}
