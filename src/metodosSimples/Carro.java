package metodosSimples;

public class Carro {

	String marca;
	String modelo;
	int numeroDePassageiros;
	double capacidadeDeCombustivel;
	double consumoDeCombusstivel;

	void exibirAutonomia() {

		double autonomia = capacidadeDeCombustivel * consumoDeCombusstivel;
		System.out.println("A autonomia do carro é: " + autonomia + " KM");
	}

}
