package recursion_III_assignment;

public class PowerOfNumbers {
	public static int _pow(int base, int pow) {
		if(pow==0) {
			return 1;
			
		}
		return base*_pow(base, pow-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2;
		int y=5;
		System.out.println(_pow(x,y));
	}


}
