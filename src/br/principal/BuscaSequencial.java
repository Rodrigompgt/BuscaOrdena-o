package br.principal;

public class BuscaSequencial {
    public static void Buscasequencial(DetalheArquivo[] vetor, int fimVetor, String palavra) {
	// TODO Auto-generated method stub
	int i = 0;
	while ((i < fimVetor) && (vetor[i].getTamanho() != palavra.length())) {
	    i++;
	}
	
	System.out.println(recurciv(vetor, fimVetor, palavra, i));
	
    }

    private static int recurciv(DetalheArquivo[] vetor, int fimVetor, String palavra, int indice) {
	// TODO Auto-generated method stub
	int x, aux,j=0;
	x = indice;
	
	while ((indice < fimVetor) && (vetor[indice].getTamanho() == palavra.length())) {
	    indice++;
	}
	aux = indice - x;
	int[] b = new int[aux];
	DetalheArquivo[] vetor2 = new DetalheArquivo[aux];

	while ((vetor[x].getNome().length() == palavra.length())) {
	    vetor2[j] = vetor[x];
	    b[j]= x; 
	    x++;
	    j++;    
	}
	int aux2=0;
	j=0;
	while ((j < vetor2.length-1) && (!vetor2[j].getNome().equalsIgnoreCase(palavra))) {
	    aux2 = b[j];
	    j++;
	    
	}
//	aux2 ++;
	if ((vetor2.length-1 == 0) || (j >= vetor2.length-1)) {
	    aux2 = -1;
	    return aux2;
	}
	
	return aux2;
    }
}
