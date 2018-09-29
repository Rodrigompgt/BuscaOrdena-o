package br.principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrincipalLerArquivo {

    public static void main(String[] args) throws IOException {
	// Ver Arquivo
	String arquivo = "C:/Users/Rodrigo/Desktop/Nova pasta/Eclipse java/ExercicioBuscaEOrdenacao/Basque.txt";
//	"C:/Users/Rodrigo/Desktop/Teste/Teste.txt"
	
	try {
	    FileReader arq = new FileReader(arquivo);
	    BufferedReader lerArq = new BufferedReader(arq);
	    
	    String linha = lerArq.readLine(); // l� a primeira linha
	    
	    
	    @SuppressWarnings("resource")
	    DetalheArquivo[] vetorArquivo = new DetalheArquivo[(int) new BufferedReader(new FileReader(arquivo)).lines().count()];
	    // a vari�vel "linha" recebe o valor "null" quando o processo
	    // de repeti��o atingir o final do arquivo texto

	    int i = 0;
	    while (linha != null) {
		System.out.println("Antes da Ordena��o: " + linha);
		vetorArquivo[i] = new DetalheArquivo();
		
		vetorArquivo[i].setNome(linha);// seta a linha
		vetorArquivo[i].setTamanho(linha.length());// seta o tamanho da linha

		linha = lerArq.readLine(); // l� da segunda at� a �ltima linha

		i++;
	    }
	    
//	    QuickSort quickSort = new QuickSort();// estancia a classe QuickSort
//	    quickSort.ordenar(vetorArquivo);//ordena o arquivo QuickSort
	    /*--------------------------------------------------------------------*/
//	    InsertSort.ordenar(vetorArquivo);//ordena o arquivo
	    /*--------------------------------------------------------------------*/
//	    BubbleSort.ordenar(vetorArquivo);//ordena o arquivo
	    /*--------------------------------------------------------------------*/
//	    SelectionSort.ordenar(vetorArquivo);//ordena o arquivo
	    /*--------------------------------------------------------------------*/
//	    MergeSort mergeSort = new MergeSort();
//	    mergeSort.ordenar(vetorArquivo);
	    MergeSort2 mergeSort2 = new MergeSort2();
	    mergeSort2.mergeSort(vetorArquivo, 0, vetorArquivo.length-1);
	    
	    System.out.println("\n");//mostra ordenado
	    for (int j = 0; j < vetorArquivo.length; j++) {
		System.out.println("Depois: " + vetorArquivo[j].getNome());
	    }

	    arq.close();

	} catch (IOException e) {
	    System.out.println("\n");
	    System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
	}

    }


}
