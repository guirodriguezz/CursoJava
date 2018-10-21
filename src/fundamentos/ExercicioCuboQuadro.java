package fundamentos;

import java.util.Scanner;

public class ExercicioCuboQuadro {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero, quadrado, cubo;
		
		System.out.println("Digite um número: ");
		numero = entrada.nextInt();
		
		quadrado = numero * numero;
		cubo = numero * numero * numero;
		
		System.out.printf("O quadrado de %d é: %d \n", numero, quadrado);
		System.out.printf("O cubo de %d é: %d", numero, cubo);
		
		entrada.close();
	}
}
