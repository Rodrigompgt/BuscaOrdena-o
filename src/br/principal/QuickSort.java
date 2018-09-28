package br.principal;

public class QuickSort {

    private DetalheArquivo array[];

    public void ordenar(DetalheArquivo[] vetor) {
	if (vetor == null || vetor.length == 0) {
	    return;
	}
	this.array = vetor;
	quickSort(0, vetor.length - 1);
    }

    private void quickSort(int valorIni, int valorFim) {

	int i = valorIni;
	int j = valorFim;
	// calcular o número de pivô, eu estou tomando pivô como número do índice médio
	int pivot = array[valorIni + (valorFim - valorIni) / 2].getTamanho();
	// Divida em duas arrays
	while (i <= j) {
	    /**
	     * Em cada iteração, vamos identificar um número do lado esquerdo que é maior
	     * então o valor pivot, e também vamos identificar um número do lado direito que
	     * é menor que o valor de pivô. Uma vez que a pesquisa é feita, então nós
	     * trocamos   * ambos os números.
	     */
	    while (array[i].getTamanho() < pivot) {
		i++;
	    }
	    while (array[j].getTamanho() > pivot) {
		j--;
	    }
	    if (i <= j) {
		trocaValores(i, j);
		// mova o índice para a próxima posição nos dois lados
		i++;
		j--;
	    }
	}
	// chame o método quickSort () recursivamente
	if (valorIni < j)
	    quickSort(valorIni, j);
	if (i < valorFim)
	    quickSort(i, valorFim);
    }

    private void trocaValores(int i, int j) {
	DetalheArquivo[] vetorArquivoTemp = new DetalheArquivo[1];
	vetorArquivoTemp[0] = new DetalheArquivo();
	vetorArquivoTemp[0].setNome(array[i].getNome());
	vetorArquivoTemp[0].setTamanho(array[i].getTamanho());

	array[i].setNome(array[j].getNome());
	array[i].setTamanho(array[j].getTamanho());

	array[j].setNome(vetorArquivoTemp[0].getNome());
	array[j].setTamanho(vetorArquivoTemp[0].getTamanho());
    }

}