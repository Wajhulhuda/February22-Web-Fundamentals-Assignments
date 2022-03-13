package recursion_IV_assignment;

public class PowerOfN {
	public static double _pow(double base, double pow) {
		if(pow==0) {
			return 1;
			
		}
		return base*_pow(base, pow-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(_pow(3,4));
	}

}
