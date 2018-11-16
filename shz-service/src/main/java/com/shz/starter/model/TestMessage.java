/**
 * 
 */
package com.shz.starter.model;

/**
 * @author shenaz
 *
 */
public class TestMessage {

	private long msgCount;
	private String message;

	/**
	 * @param id
	 * @param message
	 */
	public TestMessage(long msgCount, String message) {
		this.msgCount = msgCount;
		this.message = message;
	}

	/**
	 * @return
	 */
	public long getMsgCount() {
		return msgCount;
	}

	/**
	 * @return
	 */
	public String getMessage() {
		return message;
	}

}
