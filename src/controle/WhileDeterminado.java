package controle;
import java.util.Scanner;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double somaDasNotas = 0;
		double nota = 0;
		
		
		int contador = 0; // Inicialização
		
		while (contador < 3) {      // Condição
			
			System.out.println("Digite sua nota: ");  // Corpo
			nota = entrada.nextDouble();
			
			somaDasNotas += nota;
			contador++;             // Iteração
		}
		
		System.out.printf("A média é: %.2f", somaDasNotas / contador);
		
		entrada.close();
	}
}
