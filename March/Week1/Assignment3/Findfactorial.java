package recursion_I_assignment;

public class Findfactorial {
	static int _fact(int n) {
        // Base case
        if (n == 1)
            return 1;

        return n * _fact(n - 1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(_fact(5));

	}

}
