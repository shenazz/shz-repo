/**
 * 
 */
package com.shz;

import java.util.Scanner;

import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;
import org.apache.commons.jexl3.MapContext;

/**
 * @author shenaz
 *
 */
public class MyLab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JexlTest();
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

	private static void JexlTest() {
		JexlBuilder jexlBuilder = new JexlBuilder();
		jexlBuilder.silent(true);
		jexlBuilder.strict(false);
		JexlEngine jexlEngine = jexlBuilder.create();
		JexlExpression expression = jexlEngine.createExpression("!A && B && C");
		JexlContext ctx = new MapContext();
		//ctx.set("A", true);
		ctx.set("B", true);
		ctx.set("C", true);
		System.out.println(expression.evaluate(ctx));

	}

}
