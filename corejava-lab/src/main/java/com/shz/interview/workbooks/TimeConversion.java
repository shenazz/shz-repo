/**
 * 
 */
package com.shz.interview.workbooks;

/**
 * @author Shenaz Assu
 *
 */
public class TimeConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(timeConversion("12:53:25am"));
		System.out.println(timeConversion("12:45:54PM"));
	}

	public static String timeConversion(String s) {

		String[] parts = s.split(":");

		int hour = Integer.valueOf(parts[0]);
		boolean forenoon = parts[2].toLowerCase().endsWith("am");
		boolean midnight = forenoon && hour == 12;
		boolean noon = !forenoon && hour == 12;

		String convertedHour;
		String convertedSeconds;
		if (forenoon) {
			convertedHour = midnight ? "00" : parts[0];
			convertedSeconds = parts[2].toLowerCase().replace("am", "");
		} else {
			convertedHour = noon ? parts[0] : Integer.toString(hour + 12);
			convertedSeconds = parts[2].toLowerCase().replace("pm", "");
		}

		String convertedValue = convertedHour + ":" + parts[1] + ":" + convertedSeconds;

		return convertedValue;
	}

}
