/**
 * 
 */
package com.mongodb.m101j.util;

import static spark.Spark.get;

/**
 * @author ShenazAssu
 *
 */
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		get("/hello", (req, res) -> "Hello Bu Bu!");
	}

}
