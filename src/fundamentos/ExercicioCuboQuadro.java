package fundamentos;

import java.util.Scanner;

public class ExercicioCuboQuadro {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero, quadrado, cubo;
		
		System.out.println("Digite um n�mero: ");
		numero = entrada.nextInt();
		
		quadrado = numero * numero;
		cubo = numero * numero * numero;
		
		System.out.printf("O quadrado de %d �: %d \n", numero, quadrado);
		System.out.printf("O cubo de %d �: %d", numero, cubo);
		
		entrada.close();
	}
}
