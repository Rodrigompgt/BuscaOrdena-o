package br.principal;

public class BubbleSort {

    public static void ordenar(DetalheArquivo[] vetor) {
	for (int i = 0; i < vetor.length; i++) {
	    for (int j = 0; j < vetor.length - 1; j++) {
		if (vetor[j].getTamanho() > vetor[j + 1].getTamanho()) {
		    DetalheArquivo[] vetorArquivoTemp = new DetalheArquivo[1];
		    vetorArquivoTemp[0] = new DetalheArquivo();
		    vetorArquivoTemp[0].setNome(vetor[j].getNome());
		    vetorArquivoTemp[0].setTamanho(vetor[j].getTamanho());

		    vetor[j].setNome(vetor[j + 1].getNome());
		    vetor[j].setTamanho(vetor[j + 1].getTamanho());

		    vetor[j + 1].setNome(vetorArquivoTemp[0].getNome());
		    vetor[j + 1].setTamanho(vetorArquivoTemp[0].getTamanho());
		}
	    }
	}
    }
}
