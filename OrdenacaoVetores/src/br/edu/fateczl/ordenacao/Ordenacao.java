package br.edu.fateczl.ordenacao;

public class Ordenacao {

	public Ordenacao() {
		super();
	}

	public int[] bubbleSort(int[] vetor) {
		int tamanho = vetor.length;

		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					int aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}
		return vetor;
	}

	public int[] mergeSort(int[] vetor, int inicio, int fim) {

		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(vetor, inicio, meio);
			mergeSort(vetor, meio + 1, fim);
			intercala(vetor, inicio, meio, fim);
		}
		return vetor;
	}

	private void intercala(int[] vetor, int inicio, int meio, int fim) {
		int[] novoVetor = new int[vetor.length];
		for (int i = inicio; i <= fim; i++) {
			novoVetor[i] = vetor[i];
		}
		int esquerda = inicio;
		int direita = meio + 1;

		for (int cont = inicio; cont <= fim; cont++) {
			if (esquerda > meio) {
				vetor[cont] = novoVetor[direita];
				direita++;
			} else if (direita > fim) {
				vetor[cont] = novoVetor[esquerda];
				esquerda++;
			} else if (novoVetor[esquerda] < novoVetor[direita]) {
				vetor[cont] = novoVetor[esquerda];
				esquerda++;
			} else {
				vetor[cont] = novoVetor[direita];
				direita++;
			}
		}
	}
}
