package test.java.de.msg.recruitmenttest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.java.de.msg.recruitmenttest.StringManipulator;

public class StringManipulatorTest {
	
	StringManipulator manipulator = new StringManipulator();
	
	@Test
	public void testReverseString() {
		String result = manipulator.reverseString("abcde");
		Assert.assertEquals("edcba", result);
	}
	
	@Test
	public void testIsPalindrome() {
		boolean result = manipulator.isPalindrome("abcdcba");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testIsPalindromeForNotPalindrome() {
		boolean result = manipulator.isPalindrome("abcdc");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testFirstNonRepeatedCharacterTest() {
		char output = manipulator.firstNonRepeatedCharacter("Hello");
		Assert.assertEquals('l', output);
	}
}
