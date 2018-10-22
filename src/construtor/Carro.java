package construtor;

public class Carro {

	String marca;
	String modelo;
	int numeroDePassageiros;
	double capacidadeDeCombustivel;
	double consumoDeCombusstivel;

	public Carro(String marca, String modelo, int numeroDePassageiros, double capacidadeDeCombustivel,
			double consumoDeCombusstivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numeroDePassageiros = numeroDePassageiros;
		this.capacidadeDeCombustivel = capacidadeDeCombustivel;
		this.consumoDeCombusstivel = consumoDeCombusstivel;
	}

	void exibirAutonomia() {

		double autonomia = capacidadeDeCombustivel * consumoDeCombusstivel;
		System.out.println("A autonomia do carro é: " + autonomia + " KM");
	}

	double obterAutonomia() {

		System.out.println("Método obterAutonomia foi chamado!");

		return capacidadeDeCombustivel * consumoDeCombusstivel;
	}

	double calcularCombustivel(double km) {

		double qtdCombustivel = km / consumoDeCombusstivel;

		return qtdCombustivel;
	}

}
