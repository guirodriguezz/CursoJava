package exercicios;

public class TesteContaCorrente {
	
	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.numeroDaConta = 010207574;
		conta.saldo = 1200;
		conta.statusEspecial = true;
		conta.limite = 7000;
		
		conta.sacarDinheiro(345);
		conta.consultarSaldo();
	}

}
