package br.principal;

public class BuscaBinaria {
    public static int Binaria(int x, DetalheArquivo[] vetor) {
	int meio;
	int inicio = 0;
	int fim = vetor.length - 1;
	while (inicio <= fim) {
	    meio = (inicio + fim) / 2;
	    if (x == vetor[meio].getTamanho())
		return meio;
	    if (x < vetor[meio].getTamanho())
		fim = meio - 1;
	    else
		inicio = meio + 1;
	}
	return -1;
    }

}
