package br.principal;

public class SelectionSort {

    public static void ordenar(DetalheArquivo[] vetor) {
	for (int i = 0; i < vetor.length - 1; i++) {
	    int min = i;
	    for (int j = i + 1; j < vetor.length; j++) {
		if (vetor[j].getTamanho() < vetor[min].getTamanho()) {
		    min = j;
		}
	    }

	    DetalheArquivo[] vetorArquivoTemp = new DetalheArquivo[1];
	    vetorArquivoTemp[0] = new DetalheArquivo();
	    vetorArquivoTemp[0].setNome(vetor[i].getNome());
	    vetorArquivoTemp[0].setTamanho(vetor[i].getTamanho());

	    vetor[i].setNome(vetor[min].getNome());
	    vetor[i].setTamanho(vetor[min].getTamanho());

	    vetor[min].setNome(vetorArquivoTemp[0].getNome());
	    vetor[min].setTamanho(vetorArquivoTemp[0].getTamanho());
	}
    }
}
