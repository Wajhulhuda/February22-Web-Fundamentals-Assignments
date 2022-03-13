package recursion_I_assignment;

public class MinAndMax {
	public static int findMin(int arr[], int n) {

		if (n == 1)
			return arr[0];

		return Math.min(arr[n - 1], findMin(arr, n - 1));
	}
	
	 public static int findMax(int A[], int n)
	    {
	      // if size = 0 means whole array
	      // has been traversed
	      if(n == 1)
	        return A[0];
	         
	        return Math.max(A[n-1], findMax(A, n-1));
	    }

	public static void main(String args[]) {
		int arr[] = { 4,6,2,9,-3,-1,80,5,7,8 };
		int n = arr.length;

		System.out.println(findMin(arr, n));
		System.out.println(findMax(arr, n));
	}
}
