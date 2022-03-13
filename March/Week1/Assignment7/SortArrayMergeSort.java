package merge_and_quick_sort_assignment;

public class SortArrayMergeSort {

	void merge(int a[], int low, int high) {
		int mid = (high + low) / 2;
		int i = low, k = low, j = mid + 1;

		int tmp[] = new int[a.length];

		while (i <= mid && j <= high) {
			if (a[i] < a[j])
				tmp[k++] = a[i++];
			else {
				tmp[k] = a[j];
				j++;
				k++;
			}
		}
		while (i <= mid) {
			tmp[k++] = a[i++];
		}
		while (j <= high) {
			tmp[k++] = a[j++];
		}

		for (i = low; i <= high; i++) {
			a[i] = tmp[i];
		}
	}

	void sort(int arr[], int l, int r) {

		if (l < r) {

			int m = l + (r - l) / 2;

			sort(arr, l, m);
			sort(arr, m + 1, r);

			merge(arr, l, r);
		}

	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7, -1, 0 };

		SortArray ob = new SortArray();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}

}
