package br.principal;

public class BubleSort {
    
    public static int[] bubleSort(int[] A) {
	for(int i = A.length -1 ; i>=1;i--) {
		for(int j = 1; j<=i; j++) {
			if (A[j-1]> A[j]) {
				int t = A[j-1];
				A[j-1] = A[j];
				A[j] = t;
			}
		}
	}
	
	return A;
}

}
