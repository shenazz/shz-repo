/**
 * 
 */
package com.shz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

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
	 * @throws ExecutionException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws Exception {
		//JexlTest();

		streamTest();

	}

	public static void streamTest() throws InterruptedException, ExecutionException {
		List<Integer> intList = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 1000; i++) {
			intList.add(random.nextInt());
		}

		ExecutorService pool = Executors.newFixedThreadPool(2);

		Future<?> task2 = pool.submit(() -> {
			for (int i = 0; i < 1000; i++) {
				intList.add(random.nextInt());
				System.out.println("Adding an element");
			}
			System.out.println("Completed 2");
		});

		intList.stream().map(element -> {
			System.out.println("Mapping an element");
			return element.toString();
		}).collect(Collectors.toList());

		task2.get();

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
