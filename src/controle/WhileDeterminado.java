package controle;
import java.util.Scanner;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double somaDasNotas = 0;
		double nota = 0;
		
		
		int contador = 0; // Inicializa��o
		
		while (contador < 3) {      // Condi��o
			
			System.out.println("Digite sua nota: ");  // Corpo
			nota = entrada.nextDouble();
			
			somaDasNotas += nota;
			contador++;             // Itera��o
		}
		
		System.out.printf("A m�dia �: %.2f", somaDasNotas / contador);
		
		entrada.close();
	}
}
