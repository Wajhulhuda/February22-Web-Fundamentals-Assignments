package two_d_matrix_assignment;

public class SpiralMatrix {

	static void spiralPrint(int m, int n, int a[][]) {
		int i, k = 0, l = 0;

		/*
		 * k - starting row index, m - ending row index, l - starting column index,
		 *  n - ending column index, i - iterator
		 */

		while (k < m && l < n) {

			for (i = l; i < n; ++i) {
				System.out.print(a[k][i] + " ");
			}
			k++;

			for (i = k; i < m; ++i) {
				System.out.print(a[i][n - 1] + " ");
			}
			n--;

			if (k < m) {
				for (i = n - 1; i >= l; --i) {
					System.out.print(a[m - 1][i] + " ");
				}
				m--;
			}

			if (l < n) {
				for (i = m - 1; i >= k; --i) {
					System.out.print(a[i][l] + " ");
				}
				l++;
			}
		}
	}

	public static void main(String[] args) {
		int row = 3;
		int col = 6;
		int arr[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };

		spiralPrint(row, col, arr);
	}
}
