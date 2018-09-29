package br.principal;

public class MergeSort2 {

    public void mergeSort(DetalheArquivo[] vetor, int ini, int fim) {
	if (ini < fim) {
	    int meio = (ini + fim) / 2;
	    mergeSort(vetor, ini, meio);
	    mergeSort(vetor, meio + 1, fim);
	    intercala(vetor, ini, meio, fim);
	}
    }

    private void intercala(DetalheArquivo[] vetor, int ini, int meio, int fim) {
	DetalheArquivo[] vetor2 = new DetalheArquivo[vetor.length];
	
	for (int i = ini; i <= fim; i++) {
	    vetor2[i] = vetor[i];
	}

	int b = ini;
	int x = meio + 1;
	int y = ini;

	while (b <= meio && x <= fim) {
	    if (vetor2[b].getTamanho() <= vetor2[x].getTamanho()) {
		vetor[y] = vetor2[b];
		b++;

	    } else {
		vetor[y] = vetor2[x];
		x++;
	    }
	    y++;
	}

	int r = meio - b;
	for (int i = 0; i <= r; i++) {
	    vetor[y + i] = vetor2[b + i];
	}
    }
}
