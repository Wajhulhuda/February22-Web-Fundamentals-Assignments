package BinarySearchAssignment14feb;

public class SmallestMissingElement {
	int smallestMissing(int array[], int start, int end)
    {
        if (start > end)
            return end + 1;
 
        if (start != array[start])
            return start;
 
        int mid = (start + end) / 2;
 
        if (array[mid] == mid)
            return smallestMissing(array, mid+1, end);
 
        return smallestMissing(array, start, mid);
    }
 
 
    public static void main(String[] args)
    {
    	SmallestMissingElement small = new SmallestMissingElement();
        int arr[] = {0, 1, 2, 3,  5, 6, 7, 10};
        int n = arr.length;
        System.out.println("First Missing element is : "
                + small.smallestMissing(arr, 0, n - 1));
    }
}
