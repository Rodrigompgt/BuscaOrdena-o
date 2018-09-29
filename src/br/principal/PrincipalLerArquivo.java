package br.principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PrincipalLerArquivo {

    public static void main(String[] args) throws IOException {
	Scanner leia = new Scanner(System.in);
	int indice, b;
	String a;

	ArquivoMorto caminho = new ArquivoMorto();

	String arquivo = caminho.getTeste();// classe aquivo morto

	try {
	    FileReader arq = new FileReader(arquivo);
	    BufferedReader lerArq = new BufferedReader(arq);

	    String linha = lerArq.readLine(); // lê a primeira linha

	    @SuppressWarnings("resource")
	    DetalheArquivo[] vetorArquivo = new DetalheArquivo[(int) new BufferedReader(new FileReader(arquivo)).lines()
		    .count()];// pega o tamanho do arquivo dinamicamente
	    // a variável "linha" recebe o valor "null" quando o processo
	    // de repetição atingir o final do arquivo texto

	    int i = 0;
	    while (linha != null) {
		System.out.println("Antes da Ordenação: " + linha);
		vetorArquivo[i] = new DetalheArquivo();
		vetorArquivo[i].setNome(linha);// seta a linha
		vetorArquivo[i].setTamanho(linha.length());// seta o tamanho da linha
		linha = lerArq.readLine(); // lê da segunda até a última linha
		i++;
	    }

//	    QuickSort quickSort = new QuickSort();// estancia a classe QuickSort
//	    long tempoInicial = System.currentTimeMillis();
//	    quickSort.ordenar(vetorArquivo);//ordena o arquivo QuickSort
//	    long tempoFinal = System.currentTimeMillis();
	    /*--------------------------------------------------------------------*/
//	    long tempoInicial = System.currentTimeMillis();
//	    InsertSort.ordenar(vetorArquivo);//ordena o arquivo
//	    long tempoFinal = System.currentTimeMillis();
	    /*--------------------------------------------------------------------*/
//	    long tempoInicial = System.currentTimeMillis();
//	    BubbleSort.ordenar(vetorArquivo);//ordena o arquivo
//	    long tempoFinal = System.currentTimeMillis();
	    /*--------------------------------------------------------------------*/
//	    long tempoInicial = System.currentTimeMillis();
//	    SelectionSort.ordenar(vetorArquivo);//ordena o arquivo
//	    long tempoFinal = System.currentTimeMillis();
	    /*--------------------------------------------------------------------*/
	    MergeSort2 mergeSort2 = new MergeSort2();// estancia a classe MergeSort
	    long tempoInicial = System.currentTimeMillis();
	    mergeSort2.ordenar(vetorArquivo, 0, vetorArquivo.length - 1);// ordena o arquivo MergeSort
	    long tempoFinal = System.currentTimeMillis();
	    /*--------------------------------------------------------------------*/

	    System.out.println("\n");// mostra ordenado
	    for (int j = 0; j < vetorArquivo.length; j++) {
		System.out.println("Depois: " + vetorArquivo[j].getNome()+"      "+vetorArquivo[j].getTamanho()+"      "+j);
	    }

	    System.out.println("\nExecutado em = " + (tempoFinal - tempoInicial) + " milisegundos");
	    /*--------------------------------------------------------------------*/
	    System.out.println("Informe a palavra que quer buscar no vetor: ");
	    a = leia.nextLine();
	    b = a.length();
	    /*--------------------------------------------------------------------*/
//	    long tempoInicialbusca = System.currentTimeMillis();
//	    BuscaSequencial.Buscasequencial(vetorArquivo, vetorArquivo.length-1, a);
//	    long tempoFinalbusca = System.currentTimeMillis(); 
	    /*--------------------------------------------------------------------*/
	    long tempoInicialbusca = System.currentTimeMillis();
	    indice = BuscaBinaria.Binaria(b, vetorArquivo);
	    long tempoFinalbusca = System.currentTimeMillis();
	    /*--------------------------------------------------------------------*/
	    System.out.println(indice);	    
	    System.out.println("\nBusca executado em = " + (tempoFinalbusca - tempoInicialbusca) + " milisegundos");
	    
	    arq.close();

	} catch (IOException e) {
	    System.out.println("\n");
	    System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
	}

    }

    

}
