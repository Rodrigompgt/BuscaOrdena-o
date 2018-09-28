package br.principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrincipalLerArquivo {

    public static void main(String[] args) throws IOException {
	// Ver Arquivo
	String arquivo = "C:/Users/Rodrigo/Desktop/Teste/Basque.txt";

	try {
	    FileReader arq = new FileReader(arquivo);
	    BufferedReader lerArq = new BufferedReader(arq);
	    
	    String linha = lerArq.readLine(); // lê a primeira linha
	    
	    
	    @SuppressWarnings("resource")
	    DetalheArquivo[] vetorArquivo = new DetalheArquivo[(int) new BufferedReader(new FileReader(arquivo)).lines().count()];
	    // a variável "linha" recebe o valor "null" quando o processo
	    // de repetição atingir o final do arquivo texto

	    int i = 0;
	    while (linha != null) {
		System.out.println("Antes da Ordenação: " + linha);
		vetorArquivo[i] = new DetalheArquivo();
		
		vetorArquivo[i].setNome(linha);
		vetorArquivo[i].setTamanho(linha.length());

		linha = lerArq.readLine(); // lê da segunda até a última linha

		i++;
	    }
	    
	    QuickSort sorter = new QuickSort();// estancia a classe QuickSort
	    sorter.sort(vetorArquivo);//ordena o arquivo QuickSort
	    /*--------------------------------------------------------------------*/
//	    InsertSort.ordenar(vetorArquivo);//ordena o arquivo
	    /*--------------------------------------------------------------------*/
//	    BubbleSort.ordenar(vetorArquivo);//ordena o arquivo
	    /*--------------------------------------------------------------------*/
//	    SelectionSort.ordenar(vetorArquivo);//ordena o arquivo
	    /*--------------------------------------------------------------------*/
	    
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
