package recursion_II_assignment;

public class AverageOfNumbersInArray {

	public static float findAvg(int a[], int n)
	{
	    float sum,avg;
	    if(n==1)
	    {
	        sum=a[0];
	    }
	    else 
	    {
	        
	        sum= a[n-1]+ (n-1) * findAvg(a,n-1);
	    }
	    avg = sum/n;
	    return avg;
	}
	public static void main(String args[]) {
		int[] arr= {1,2,3,4,5,6};
		int n=arr.length;
		System.out.println(findAvg(arr, n));
	}

}
