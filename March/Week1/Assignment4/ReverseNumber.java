package recursion_II_assignment;

public class ReverseNumber {
	public static void revNumber(int num) {

		if (num < 10) {
			System.out.println(num);
			return;
		}

		else {

			System.out.print(num % 10);

			revNumber(num / 10);
		}
	}

	// driver code
	public static void main(String args[]) {

		int num = 47975;

		revNumber(num);
	}

}
