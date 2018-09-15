package br.principal;

public class SelectionSort {
    public static int[] selectSort(int[] A) {
	
	for(int i = 0; i <= A.length -2; i++) {
		int min = i;
		for(int j=i+1; j<=A.length; i++ ) {
			if(A[j]< A[min]) {
				min=j;
			}
		}
		int t= A[min];
		A[min] = A[i];
		A[i] = t;
		
	}
	
	
	return A;
}

}
