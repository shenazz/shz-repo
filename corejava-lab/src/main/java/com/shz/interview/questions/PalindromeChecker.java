/**
 * 
 */
package com.shz.interview.questions;

/**
 * @author shenaz
 *
 */
public class PalindromeChecker {

	/**
	 * Returns true if the given word is palindrome, ignoring the case.
	 * 
	 * @param word
	 * @return
	 */
	public static boolean isPalindromeV1(String word) {

		String lowerCaseWord = word.toLowerCase();
		String paliWord = "";

		for (int i = lowerCaseWord.length() - 1; i >= 0; i--) {
			paliWord = paliWord + lowerCaseWord.charAt(i);
		}

		for (int i = 0; i < lowerCaseWord.length(); i++) {
			char a = lowerCaseWord.charAt(i);
			char b = lowerCaseWord.charAt((lowerCaseWord.length() - 1) - i);

			if (a != b) {
				return false;
			}
		}

		return true;
	}

	public static boolean isPalindrome(String word) {

		String paliWord = new StringBuilder(word).reverse().toString();

		return word.equalsIgnoreCase(paliWord);
	}

	/**
	 * Launches the test
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(PalindromeChecker.isPalindrome("Anna")); // should be true
		System.out.println(PalindromeChecker.isPalindrome("Nauruan")); // should be true
		System.out.println(PalindromeChecker.isPalindrome("Florian")); // should be false
		System.out.println(PalindromeChecker.isPalindrome("Floriaf")); // should be false
	}
}
