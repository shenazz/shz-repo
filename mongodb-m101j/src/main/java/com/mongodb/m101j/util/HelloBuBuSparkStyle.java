/**
 * 
 */
package com.mongodb.m101j.util;

import spark.Spark;

/**
 * @author ShenazAssu
 *
 */
public class HelloBuBuSparkStyle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Spark.get("/hello", (req, res) -> "Hello Bu Bu!");
	}

}
