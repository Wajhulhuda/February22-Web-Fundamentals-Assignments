package stack_queue_assignment;

import java.util.Stack;

public class ReverseWordInString {

	public static String reverseText(String s) {

		if (s == null || s.length() == 0) {
			return s;
		}

		int low = 0, high = 0;

		Stack<String> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == ' ') {

				stack.push(s.substring(low, high + 1));

				low = high = i + 1;
			} else {
				high = i;
			}
		}

		stack.push(s.substring(low));

		StringBuilder sb = new StringBuilder();
		while (!stack.empty()) {
			sb.append(stack.pop()).append(' ');
		}

		return sb.substring(0, sb.length() - 1);
	}

	public static void main(String[] args) {
		String s = "Geekster is a Hope for Computer Science";
		System.out.println(s);
		System.out.println(reverseText(s));
	}
}
