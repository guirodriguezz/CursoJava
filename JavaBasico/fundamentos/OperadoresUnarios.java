package fundamentos;

public class OperadoresUnarios {
	
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;
		
		// Incrementos e decremento
		
		num1++; // P�s fixada
		System.out.println(num1);
		
		--num1; // Pr� fixada
		System.out.println(num1);
		
		System.out.println(++num1 == num2--); // O num2 vai ter decremento ap�s a compara��o.
		
		System.out.println(num1 == num2);
		
		// Complemento bin�rio
		
		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toBinaryString(~50));
		
		// Negac�o
		
		System.out.println(!false);
	}
}
