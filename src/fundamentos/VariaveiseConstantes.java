package fundamentos;

public class VariaveiseConstantes {
	
	public static void main(String[] args) {
		
		double raio = 4.5;
		final double PI = 3.1416;
		double area = PI * raio * raio;
		
		System.out.println("A area � " + area + " m2. ");
		System.out.printf("A area � %.2f m2. ", area);
	}

}
