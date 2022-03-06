package BinarySearchAssignment14feb;

public class MissingElementIndex {
	
	static int find_index(int[] arr, int n, int target)
	{
	     
	    int start = 0;
	    int end = n - 1;
	 
	    
	    while (start <= end)
	    {
	        int mid = (start + end) / 2;
	 
	       
	        if (arr[mid] == target)
	            return mid;
	 
	        else if (arr[mid] < target)
	            start = mid + 1;
	 
	        else
	            end = mid - 1;
	    }
	 
	  
	    return end + 1;
	}
	 
	public static void main(String[] args)
	{
	    int[] arr = { 1, 2,4,5, 5,9 };
	    int n = arr.length;
	    int target = 6;
	     
	    System.out.println(find_index(arr, n, target));
	}

}
