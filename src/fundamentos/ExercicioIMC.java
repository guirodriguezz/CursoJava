package fundamentos;

import java.util.Scanner;

public class ExercicioIMC {
	
	public static void main(String[] args) {
		
		Scanner entrada  = new Scanner(System.in);
		
		double peso, altura, imc;
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = entrada.nextLine();
		System.out.println("Digite seu peso: ");
		peso = entrada.nextDouble();
		System.out.println("Digite sua altura: ");
		altura = entrada.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.println(nome + " Seu IMC é: " + imc);
		System.out.printf("%s seu IMC é: %.2f", nome, imc);
		
		entrada.close();
	}
}
