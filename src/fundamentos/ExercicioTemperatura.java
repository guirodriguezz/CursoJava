package fundamentos;

import java.util.Scanner;

public class ExercicioTemperatura {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int celsius;
		int fahrenheit;
		
		System.out.println("Digite Celsius: ");
		celsius = entrada.nextInt();
		
		fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.println("Fahrenheit: " + fahrenheit);
		
		entrada.close();
	}

}
