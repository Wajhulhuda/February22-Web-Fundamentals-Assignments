package recursion_I_assignment;

public class CheckpalindromString {

	public static int palindrome_check(char[] str, int start, int end) {
		if (start == end || (end - start == 1)) {
			return 1;
		} else {
			if (str[start] == str[end]) {
				return palindrome_check(str, start + 1, end - 1);
			} else {
				return 0;
			}
		}
	}

	public static void main(String[] args) {
		String str="racecar";
		char a[] = str.toCharArray();
		int n = str.length();
		if (palindrome_check(a, 0, n - 1)==1) {
			System.out.println("String is palindrom");
		} else {
			System.out.println("Not palindrom");
		}
	}

}
