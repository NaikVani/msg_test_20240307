package main.java.de.msg.recruitmenttest;

import java.util.HashSet;
import java.util.Set;

public class StringManipulator {

	// Task 1.1
	// Write a method that reverses a given string.
	public String reverseString(String input) {
		String result = "";
		if (input == null) {
			result = null;
		} else if (input.isEmpty()) {
			result = "";
		} else {
			char[] arr = input.toCharArray();
			for (int i = arr.length - 1; i >= 0; i--)
				result = result + arr[i];
		}
		return result;

	}

	// Task 1.2
	// Write a method that checks if a given string is a palindrome.
	public boolean isPalindrome(String input) {
		int i = 0, j = input.length() - 1;
		if (input.isEmpty() || input.length() == 1) {
			return true;
		} else {
			while (i < j) {
				if (input.charAt(i) != input.charAt(j)) {
					return false;
				}
				i++;
				j--;
			}
		}
		return true;
	}

	// Task 1.3
	// Write a method that finds the first non-repeated character in a given string.
	public char firstNonRepeatedCharacter(String input) {
		Set<Character> set = new HashSet<Character>();
		if (input.isEmpty() || input.length() == 1) {
			return '\0';
		}
		char[] arr = input.replaceAll("\\s+", " ").trim().toCharArray();
		for (char i : arr) {
			if (set.add(i) == false) {
				return i;
			}
		}
		return '\0';
	}
}
