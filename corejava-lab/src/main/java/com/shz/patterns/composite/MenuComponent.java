/**
 * 
 */
package com.shz.patterns.composite;

import java.util.Iterator;
import java.util.List;

/**
 * @author shenaz
 *
 */
public abstract class MenuComponent {

	/**
	 * 
	 */
	public String getName() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 */
	public String getLink() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 */
	public void print() {
		throw new UnsupportedOperationException();
	}

	/**
	 * @return
	 */
	public List<MenuComponent> getChildern() {
		throw new UnsupportedOperationException();
	}

	/**
	 * @return
	 */
	public void addChildern(MenuComponent child) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @return
	 */
	public Iterator<MenuComponent> createIterator() {
		throw new UnsupportedOperationException();
	}

}
