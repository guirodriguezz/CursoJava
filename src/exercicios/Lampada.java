package exercicios;

public class Lampada {

	String modelo;
	String tensão;
	int potencia;
	String tipoDeLuz;
	int garantiaEmMeses;
	String[] tipos;
	boolean tipoAbajur;

	boolean ligada;

	void ligar() {

		ligada = true;
		System.out.println("Lampada Ligada!");
	}

	void desligar() {

		ligada = false;
		System.out.println("Lampada Desligada!");
	}

}
