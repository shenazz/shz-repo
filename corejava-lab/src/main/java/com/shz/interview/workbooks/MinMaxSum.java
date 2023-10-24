/**
 * 
 */
package com.shz.interview.workbooks;

import java.util.Arrays;
import java.util.List;

/**
 * @author Shenaz Assu
 *
 */
public class MinMaxSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		miniMaxSum(Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625));

	}

	/*
	 * Complete the 'miniMaxSum' function below.
	 *
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */
	public static void miniMaxSum(List<Integer> arr) {
		long sum = 0;
		long smallest = Integer.MAX_VALUE;
		long largest = 0;
		for (int i = 0; i < arr.size(); i++) {
			Integer current = arr.get(i);
			sum += current;
			if (current < smallest) {
				smallest = current;
			}
			if (current > largest) {
				largest = current;
			}

		}

		System.out.println((sum - largest) + " " + (sum - smallest));
	}

}
