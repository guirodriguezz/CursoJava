package metodosSimples;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro();

		van.marca = "Ford";
		van.modelo = "Ducato";
		van.numeroDePassageiros = 10;
		van.capacidadeDeCombustivel = 100;
		van.consumoDeCombusstivel = 0.2;
		
		van.exibirAutonomia();

	}

}
