package View;

import br.edu.fateczl.ordenacao.Ordenacao;

public class Principal {

	public static void main(String[] args) {

		int[] vetor = { 69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1 };
		Ordenacao ordenacao = new Ordenacao();

		ordenacao.bubbleSort(vetor);

		for (int valor : vetor) {
			System.out.print(valor + " ");
		}
		
		System.out.println();
		
		ordenacao.mergeSort(vetor, 0, vetor.length - 1);
		
		for (int valor : vetor) {
			System.out.print(valor + " ");
		}
	}
}
