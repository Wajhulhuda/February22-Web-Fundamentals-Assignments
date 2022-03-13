package recursion_I_assignment;

public class PrintEvenReverseOrder {

	public static void printEven(int x, int N) {
		if (x > N) {
			return;
		}
		
		printEven(x + 1, N);
		
		if (x % 2 == 0) {
			System.out.print(x + ",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 76;
		printEven(1, N);

	}

}
