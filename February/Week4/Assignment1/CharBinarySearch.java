package BinarySearchAssignment14feb;

import java.util.Arrays;

public class CharBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = {'a','b','d','e','f','g','h','i','x','z'};
		
		int result = Arrays.binarySearch(arr, 'z');
		System.out.println("The char is at index "+result);

	}

}
