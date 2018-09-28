package br.principal;

public class InsertSort {

    public static void ordenar(DetalheArquivo[] vetor) {
	Integer j;
	Integer key;
	String nome;
	Integer i;
	for (j = 1; j < vetor.length; j++) {
	    key = vetor[j].getTamanho();
	    nome = vetor[j].getNome();
	    for (i = j - 1; (i >= 0) && (vetor[i].getTamanho() > key); i--) {
		vetor[i + 1].setNome(vetor[i].getNome());
		vetor[i + 1].setTamanho(vetor[i].getTamanho());
	    }
	    vetor[i + 1].setNome(nome);
	    vetor[i + 1].setTamanho(key);
	}
    }
}
