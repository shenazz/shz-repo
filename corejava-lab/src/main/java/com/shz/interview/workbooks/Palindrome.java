/**
 * 
 */
package com.shz.interview.workbooks;

/**
 * A palindrome is a word that reads the same backward or forward. Implement the function isPalindrome(..) that returns true if the given
 * word is a palindrome. The character case should be ignored.
 */
public class Palindrome {

	/**
	 * Returns true if the given word is palindrome, ignoring the case.
	 * 
	 * @param word
	 * @return
	 */
	public static boolean isPalindrome(String word) {
		
		
		return false;
	}

	/**
	 * Launches the test
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(Palindrome.isPalindrome("Anna")); // should be true
		System.out.println(Palindrome.isPalindrome("Nauruan")); // should be true
		System.out.println(Palindrome.isPalindrome("Florian")); // should be false
		System.out.println(Palindrome.isPalindrome("Floriaf")); // should be false

	}

}
