package br.principal;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {

    

    public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
	
	//Ver Arquivo
	String arquivo = "C:/Users/Rodrigo/Desktop/Teste/Teste.txt";
	try {
	      FileReader arq = new FileReader(arquivo);
	      BufferedReader lerArq = new BufferedReader(arq);
	 
	      String linha = lerArq.readLine(); // l� a primeira linha
	// a vari�vel "linha" recebe o valor "null" quando o processo
	// de repeti��o atingir o final do arquivo texto
	      while (linha != null) {
	        System.out.printf("%s\n", linha);
	 
	        linha = lerArq.readLine(); // l� da segunda at� a �ltima linha
	      }
	 
	      arq.close();
	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	          e.getMessage());
	    }
	

    }
}
