package two_d_matrix_assignment;

import java.util.Scanner;

public class CreatePrintMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row");
		int row = sc.nextInt();
		System.out.println("Enter col");
		int col = sc.nextInt();
		int mat[][] = new int[row][col];
		System.out.println("Enter the elements");
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				mat[i][j] = sc.nextInt();
			}

		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

}
