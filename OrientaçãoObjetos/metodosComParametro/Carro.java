package metodosComParametro;

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
	
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado!");
		
		return capacidadeDeCombustivel * consumoDeCombusstivel;
	}
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km / consumoDeCombusstivel;
		
		return qtdCombustivel;
	}


}
