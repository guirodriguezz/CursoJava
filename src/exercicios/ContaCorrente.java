package exercicios;

public class ContaCorrente {

	int numeroDaConta;
	double saldo;
	boolean statusEspecial;
	double limite;

	void sacarDinheiro(double valorDeSaque) {

		if (valorDeSaque > saldo) {

			System.out.println("Você não pode sacar!");

		} else {

			double saque = saldo - valorDeSaque;
			System.out.println("Você sacou " + saque);
		}

	}

	void depositarDinheiro(double valorDeDeposito) {

		double deposito = saldo + valorDeDeposito;
		System.out.println("Você depositou " + deposito);
	}

	void consultarSaldo() {

		System.out.println("Seu saldo atual é: " + saldo);
	}

}
