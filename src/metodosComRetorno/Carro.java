package metodosComRetorno;

public class Carro {
	
	String marca;
	String modelo;
	int numeroDePassageiros;
	double capacidadeDeCombustivel;
	double consumoDeCombusstivel;

	void exibirAutonomia() {

		double autonomia = capacidadeDeCombustivel * consumoDeCombusstivel;
		System.out.println("A autonomia do carro �: " + autonomia + " KM");
	}
	
	double obterAutonomia() {
		
		System.out.println("M�todo obterAutonomia foi chamado!");
		
		return capacidadeDeCombustivel * consumoDeCombusstivel;
	}

}
