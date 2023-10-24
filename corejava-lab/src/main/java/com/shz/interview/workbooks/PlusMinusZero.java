/**
 * 
 */
package com.shz.interview.workbooks;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

/**
 * @author Shenaz Assu
 *
 */
public class PlusMinusZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1));
	}

	/*
	 * Complete the 'plusMinus' function below.
	 *
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */
	public static void plusMinus(List<Integer> arr) {
		double positiveCount = 0;
		double negativeCount = 0;
		double zeroCount = 0;

		DecimalFormat df = new DecimalFormat("0.000000");

		for (int element : arr) {
			if (element > 0) {
				positiveCount++;
			} else if (element == 0) {
				zeroCount++;
			} else if (element < 0) {
				negativeCount++;
			}
		}

		System.out.println(df.format(positiveCount / arr.size()));
		System.out.println(df.format(negativeCount / arr.size()));
		System.out.println(df.format(zeroCount / arr.size()));
	}

}
