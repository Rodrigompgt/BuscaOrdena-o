package br.principal;

public class MergeSort {
    public static int[] MergeSort(int[] vet, int i, int f) {
	    if (i < f) {
	        int m = (i + f) / 2;
	        MergeSort(vet, i, m);
	        MergeSort(vet, m + 1, f);
	        intercala(vet, i, m, f);
	    }
	    return vet;
	}
	
	private static int[] intercala(int[] vet, int i, int m, int f) {
	    int vet2[] = new int[vet.length];
	    for (int j = i; j <= m; j++) {
	        vet2[j] = vet[j];
	    }
	    for (int g = m + 1; g < f; g++) {
	        vet2[f + m - g] = vet[g];
	    }
	    int x = i;
	    int z = f - 1;
	    for (int k = i; k < f; k++) {
	        if (vet2[x] <= vet2[z]) {
	            vet[k] = vet2[x];
	            x = x + 1;
	        } else {
	            vet[k] = vet2[z];
	            z = z - 1;
	        }
	    }
	    return vet;
	}
}
