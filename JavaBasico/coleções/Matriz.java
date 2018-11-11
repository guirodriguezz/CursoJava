package coleções;

public class Matriz {

	public static void main(String[] args) {

		// Primeira forma de escrever
		double[][] notasJoao = { { 7.7, 8.6 }, { 6.2, 9.7 } };

		// Segunda forma de escrever
		double[][] notasPedro = new double[2][];
		notasPedro[0] = new double[2];
		notasPedro[1] = new double[2];
		notasPedro[0][0] = 7.7;
		notasPedro[0][1] = 8.6;
		notasPedro[1][0] = 6.2;
		notasPedro[1][1] = 9.7;

		double totalJoao = 0;
		double totalPedro = 0;
		int qtdNotasJoao = 0;
		int qtdNotasPedro = 0;

		// For normal, que percorre cada índice
		for (int i = 0; i < notasJoao.length; i++) {       // Percorre o array externo
			for (int j = 0; j < notasJoao[i].length; j++) {   // Percorre o array interno
				totalJoao += notasJoao[i][j];
				qtdNotasJoao++;
			}
		}

		// Foreach, que percorre de uma vez
		for (double[] notasParciais : notasPedro) {
			for (double nota : notasParciais) {

				totalPedro += nota;
				qtdNotasPedro++;
			}
		}

		System.out.println(totalJoao / qtdNotasJoao);
		System.out.println(totalPedro / qtdNotasPedro);
	}

}
