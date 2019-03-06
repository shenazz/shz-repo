/**
 * 
 */
package com.shz.interview.questions;

import java.util.Scanner;

/**
 * Write a piece of code that loops from 1 to 100 and prints to the console, on each row, the following:
 * 
 * Current number (always) + a space (always) + "foo" (excluding every 10th row) + "bar" (only on every 5th row)
 * 
 * @author shenaz
 */
public class FooBarPrinter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			System.out.println("SES Interview Test");
			System.out.println("====================");

			scanner = new Scanner(System.in);
			System.out.println("Please enter the loop count: ");

			final int count = scanner.nextInt();

			for (int i = 1; i <= count; i++) {
				System.out.print(i + " ");
				if (i % 10 != 0) {
					System.out.print("foo");
				}
				if (i % 5 == 0) {
					System.out.print("bar");
				}
				System.out.println();
			}
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}
