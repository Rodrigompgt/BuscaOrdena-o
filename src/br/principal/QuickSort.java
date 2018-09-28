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
	// calcular o n�mero de piv�, eu estou tomando piv� como n�mero do �ndice m�dio
	int pivot = array[valorIni + (valorFim - valorIni) / 2].getTamanho();
	// Divida em duas arrays
	while (i <= j) {
	    /**
	     * Em cada itera��o, vamos identificar um n�mero do lado esquerdo que � maior
	     * ent�o o valor pivot, e tamb�m vamos identificar um n�mero do lado direito que
	     * � menor que o valor de piv�. Uma vez que a pesquisa � feita, ent�o n�s
	     * trocamos � * ambos os n�meros.
	     */
	    while (array[i].getTamanho() < pivot) {
		i++;
	    }
	    while (array[j].getTamanho() > pivot) {
		j--;
	    }
	    if (i <= j) {
		trocaValores(i, j);
		// mova o �ndice para a pr�xima posi��o nos dois lados
		i++;
		j--;
	    }
	}
	// chame o m�todo quickSort () recursivamente
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