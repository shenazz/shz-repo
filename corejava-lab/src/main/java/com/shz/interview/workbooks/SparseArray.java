/**
 * 
 */
package com.shz.interview.workbooks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Shenaz Assu
 *
 */
public class SparseArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/*
	 * Complete the 'matchingStrings' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts following parameters: 1. STRING_ARRAY strings 2.
	 * STRING_ARRAY queries
	 */
	public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
		List<Integer> counts = new ArrayList<>();
		for (String query : queries) {
			int count = 0;
			for (String string : strings) {
				if (string.equals(query)) {
					count++;
				}
			}
			counts.add(count);
		}

		return counts;
	}

}
