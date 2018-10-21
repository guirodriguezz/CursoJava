package controle;

import java.util.Scanner;

public class ExercicioNota {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();
		
		media = nota1 + nota2 / 2;
		
		if (media >= 7) {
			System.out.printf("Aluno aprovado, sua média final é: %.2f", media);
			
		} else if (media < 7 && media > 4) {
			System.out.printf("Aluno de recuperação, sua média final é: %.2f", media);	
			
		} else {
			System.out.printf("Aluno reprovado, sua média final é: %.2f", media);
		}
		
		entrada.close();
	}
}
