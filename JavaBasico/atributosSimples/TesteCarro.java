package atributosSimples;

public class TesteCarro {
	
	public static void main(String[] args) {
		
		Carro van = new Carro();
		
		van.marca = "Ford";
		van.modelo = "Ducato";
		van.numeroDePassageiros = 10;
		van.capacidadeDeCombustivel = 100;
		van.consumoDeCombusstivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		
		Carro fusca = new Carro();
		
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numeroDePassageiros = 4;
		fusca.capacidadeDeCombustivel = 30;
		fusca.consumoDeCombusstivel = 0.15;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
	}

}
