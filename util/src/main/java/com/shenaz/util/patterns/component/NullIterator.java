/**
 * 
 */
package com.shenaz.util.patterns.component;

import java.util.Iterator;

/**
 * @author shenaz
 *
 */
public class NullIterator implements Iterator<MenuComponent> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#next()
	 */
	@Override
	public MenuComponent next() {
		return null;
	}

}
