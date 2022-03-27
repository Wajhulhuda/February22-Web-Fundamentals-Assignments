package stack_queue_assignment;

import java.util.Stack;

public class RemoveAdjacentCharacter {
	public void removeAdjacentDuplicate(String text) {
		if (text.length() == 0) {
			return;
		}

		String result = "";
		int element = 0;

		Stack<Character> record = new Stack<Character>();

		while (element < text.length()) {
			if (record.isEmpty() || record.peek() != text.charAt(element)) {

				record.push(text.charAt(element));
			} else {

				record.pop();
			}

			element++;
		}

		while (!record.isEmpty()) {
			result = record.peek() + result;
			record.pop();
		}

		System.out.println(" Given Text : " + text);

		System.out.println(" Remove Adjacent Duplicate : [" + result + "]");
	}

	public static void main(String[] args) {
		RemoveAdjacentCharacter task = new RemoveAdjacentCharacter();

		task.removeAdjacentDuplicate("xxzz");

		task.removeAdjacentDuplicate("abccccbe");

		task.removeAdjacentDuplicate("abcccbe");

		task.removeAdjacentDuplicate("xyzzz");
	}
}
