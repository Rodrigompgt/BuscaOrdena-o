package br.principal;

public class QuickSort {

    private DetalheArquivo array[];

    public void sort(DetalheArquivo[] inputArr) {
	if (inputArr == null || inputArr.length == 0) {
	    return;
	}
	this.array = inputArr;
	quickSort(0, inputArr.length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {

	int i = lowerIndex;
	int j = higherIndex;
	// calculate pivot number, I am taking pivot as middle index number
	int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2].getTamanho();
	// Divide into two arrays
	while (i <= j) {
	    /**
	     * In each iteration, we will identify a number from left side which is greater
	     * then the pivot value, and also we will identify a number from right side
	     * which is less then the pivot value. Once the search is done, then we exchange
	     * both numbers.
	     */
	    while (array[i].getTamanho() < pivot) {
		i++;
	    }
	    while (array[j].getTamanho() > pivot) {
		j--;
	    }
	    if (i <= j) {
		exchangeNumbers(i, j);
		// move index to next position on both sides
		i++;
		j--;
	    }
	}
	// call quickSort() method recursively
	if (lowerIndex < j)
	    quickSort(lowerIndex, j);
	if (i < higherIndex)
	    quickSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
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