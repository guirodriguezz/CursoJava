package exercicios;

public class ContaCorrente {

	int numeroDaConta;
	double saldo;
	boolean statusEspecial;
	double limite;

	void sacarDinheiro(double valorDeSaque) {

		if (valorDeSaque > saldo) {

			System.out.println("Voc� n�o pode sacar!");

		} else {

			double saque = saldo - valorDeSaque;
			System.out.println("Voc� sacou " + saque);
		}

	}

	void depositarDinheiro(double valorDeDeposito) {

		double deposito = saldo + valorDeDeposito;
		System.out.println("Voc� depositou " + deposito);
	}

	void consultarSaldo() {

		System.out.println("Seu saldo atual �: " + saldo);
	}

}
