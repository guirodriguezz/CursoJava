package fundamentos;

public class OperadoresUnarios {
	
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;
		
		// Incrementos e decremento
		
		num1++; // Pós fixada
		System.out.println(num1);
		
		--num1; // Pré fixada
		System.out.println(num1);
		
		System.out.println(++num1 == num2--); // O num2 vai ter decremento após a comparação.
		
		System.out.println(num1 == num2);
		
		// Complemento binário
		
		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toBinaryString(~50));
		
		// Negacão
		
		System.out.println(!false);
	}
}
