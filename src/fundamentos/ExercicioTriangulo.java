package fundamentos;

import java.util.Scanner;

public class ExercicioTriangulo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double altura, base, area;
		
		System.out.println("Digite a altura do triangulo: ");
		altura = entrada.nextDouble();
		System.out.println("Digite a base do triangulo: ");
		base = entrada.nextDouble();
		
		area = base * altura / 2;
		
		System.out.printf("A area do triangulo é: %.2f", area);
		
		entrada.close();
	}
}
