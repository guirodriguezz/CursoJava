package construtor;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro("Ford", "Ducato", 10, 100, 0.2);

		van.exibirAutonomia();

		double autonomia = van.obterAutonomia();

		System.out.println(autonomia + " KM");

		double qtdCombustivel = van.calcularCombustivel(autonomia);

		System.out.println("Para " + autonomia + " KM, você precisa de: " + qtdCombustivel);

	}

}
