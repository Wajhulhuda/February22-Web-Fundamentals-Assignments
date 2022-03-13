package arraylist_and_sorting_assignment;

import java.util.Arrays;

public class sortArrayBasedOnAnotherArray {

	static int checkFirstOccurence(int arr[], int low, int high, int x, int n) {
		if (high >= low) {

			int mid = low + (high - low) / 2;

			if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x)
				return mid;
			if (x > arr[mid])
				return checkFirstOccurence(arr, (mid + 1), high, x, n);
			return checkFirstOccurence(arr, low, (mid - 1), x, n);
		}
		return -1;
	}

	static void sorting(int A1[], int A2[], int m, int n) {

		int temp[] = new int[m], visited[] = new int[m];
		for (int i = 0; i < m; i++) {
			temp[i] = A1[i];
			visited[i] = 0;
		}

		Arrays.sort(temp);

		int inx = 0;

		for (int i = 0; i < n; i++) {

			int first = checkFirstOccurence(temp, 0, m - 1, A2[i], m);

			if (first == -1)
				continue;

			for (int j = first; (j < m && temp[j] == A2[i]); j++) {
				A1[inx++] = temp[j];
				visited[j] = 1;
			}
		}

		for (int i = 0; i < m; i++)
			if (visited[i] == 0)
				A1[inx++] = temp[i];
	}

	static void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		int A1[] = { 4,3,45,6,4,7,8,4,35,7,74,3 };
		int A2[] = { 3,7,4,35};
		int m = A1.length;
		int n = A2.length;
		
		sorting(A1, A2, m, n);
		printArray(A1, m);
	}
}
