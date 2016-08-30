package lcTestCoding;

public class MergeSortedArray {
	public static void merge(int[] A, int m, int[] B, int n) {
		//backwards
		int i=m-1, j=n-1, k=m+n-1;
		while (i>-1 && j>-1) A[k--]= (A[i]>B[j]) ? A[i--] : B[j--];
		while (j>-1)         A[k--]=B[j--];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,3,5,7,9,0,0,0,0,0,0,0,0};
		int B[] = {2,4,6,8,16};
		merge(A,5,B,5);
		System.out.println(A);

	}

}
