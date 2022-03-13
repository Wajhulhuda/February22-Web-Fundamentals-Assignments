package recursion_II_assignment;

public class BinarySearch {
	public static int binarySearch(int arr[], int start, int end, int x) {
		if (end >= start) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, start, mid - 1, x);
			return binarySearch(arr, mid + 1, end, x);
		}
		return -1;
	}

	public static void main(String args[]) {

		int arr[] = { 56, 78, 90, 32, 45, 99, 104 };
		int len = arr.length;
		int x = 104;
		int result = binarySearch(arr, 0, len - 1, x);
		if (result == -1)
			System.out.println("The element is not present in the array");
		else
			System.out.println("The element found at index " + result);
	}

}
