/**
 * 
 */
package com.shz;

import java.util.Scanner;

/**
 * @author shenaz
 *
 */
public class MyLab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		varArgTest();
	}

	public static void varArgTest(String... names) {
		for (String string : names) {
			System.out.println(string);
		}
	}

	private static void scannerTest() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your name: ");

		System.out.println("Your name is " + scanner.next());

		System.out.println("Please enter your age: ");

		System.out.println("Your age is " + scanner.next());
	}

}
