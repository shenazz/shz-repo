/**
 * 
 */
package com.shz.interview.questions;

import java.io.File;

/**
 * @author shenaz
 *
 */
public class FilesFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File root = new File("..");
		System.out.println("Starting scan at: " + root.getAbsolutePath());

		new FilesFinder().findFiles(root, "java");

	}

	/**
	 * @param folder
	 * @param extension
	 */
	private void findFiles(File folder, String extension) {
		if (folder.isDirectory()) {
			File[] listFiles = folder.listFiles();
			for (File subFile : listFiles) {
				findFiles(subFile, extension);
			}
		} else {
			if (folder.getName().endsWith(extension)) {
				System.out.println(folder);
			}
		}
	}
}
