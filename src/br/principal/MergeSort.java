package br.principal;

public class MergeSort {
    private DetalheArquivo array[];

    public void ordenar(DetalheArquivo[] vetor) {
	if (vetor == null || vetor.length == 0) {
	    return;
	}
	this.array = vetor;
	mergeSort(vetor,0, vetor.length-1);
    }

    private static void mergeSort(DetalheArquivo[] vetor, int inicio, int fim) {
	int meio;
	if (inicio < fim) {
	    meio = (inicio + fim) / 2;
	    mergeSort(vetor, inicio, meio);
	    mergeSort(vetor, meio + 1, fim);
	    intercala(vetor, inicio, meio, fim);
	}
    }

    private static void intercala(DetalheArquivo[] vetor, int inicio, int meio, int fim) {
	int i, j;
	
	String[] ArrayStr = new String[vetor.length];
	Integer[] arraynum = new Integer[vetor.length];
	
	for (int b = inicio; b < meio; b++) {
	    ArrayStr[b] = vetor[b].getNome();
	    arraynum[b] = vetor[b].getTamanho();
	}
	for (int x = meio + 1; x <= fim; x++) {
	    ArrayStr[fim + meio + 1 - x] = vetor[x].getNome();
	    arraynum[fim + meio + 1 - x] =vetor[x].getTamanho();
	}
	i = inicio;
	j = fim;
	for (int k = inicio; k < fim; k++) {
	    if (arraynum[i] < arraynum[j]) {
		vetor[k].setNome(ArrayStr[i]);
		vetor[k].setTamanho(arraynum[i]);
		i = i + 1;
	    } else {
		vetor[k].setNome(ArrayStr[j]);
		vetor[k].setTamanho(arraynum[j]);		
		
		j = j - 1;
	    }
	}	
    }
}
