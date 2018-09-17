package br.principal;

public class InsertionSort {

    public static int[] insertionSort(int[] A) {
	
	for (int i = 0; i < A.length; i++) 
        {
                int B = A[i];
                for (int j = i - 1; j >= 0 && A[j] > B; j--)
                {
                        A[j + 1] = A[j];
                        A[j] = B;
                }                       
        }
	return A; 

    }
}
