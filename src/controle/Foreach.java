package controle;

import java.util.Random;

public class Foreach {

	public static void main(String[] args) {

		Random numerosAleatorios = new Random(); // Gerar números aleatórios

		double[][] notasAlunos = new double[3][4];

		for (int i = 0; i < notasAlunos.length; i++) { // Para preencher um Array, utilizar o For padrão
			for (int j = 0; j < notasAlunos[i].length; j++) {

				notasAlunos[i][j] = numerosAleatorios.nextInt(10);

			}

		}

		// Para mostrar na tela (output) pode se usar o Foreach

		for (double[] notasAluno : notasAlunos) { // Para matriz se utiliza um conchete na frente do tipo
			for (double nota : notasAluno) { // Após entrar utiliza o for como no vetor

				System.out.print(nota + " ");
			}

			System.out.println();
		}
	}
}
