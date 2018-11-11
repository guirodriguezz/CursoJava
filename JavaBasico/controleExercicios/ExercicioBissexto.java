package controleExercicios;

import java.util.Scanner;

public class ExercicioBissexto {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int ano;
		
		System.out.println("Digite o ano: ");
		ano = entrada.nextInt();
		
		if (ano % 4 == 0) {
			System.out.println("O ano é bissexto!");
		} else {
			System.out.println("O ano não é bissexto");
		}
		
		entrada.close();
	}
}
