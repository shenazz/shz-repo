/**
 * 
 */
package com.shenaz.util.patterns.component;

import java.util.Iterator;

/**
 * @author shenaz
 *
 */
public abstract class MenuComponent {

	/**
	 * @return
	 */
	public String getName() {
		throw new UnsupportedOperationException();
	}

	/**
	 * @param menuComponent
	 */
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 */
	public void print() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 */
	public boolean isVeg() {
		throw new UnsupportedOperationException();
	}

	/**
	 * @return
	 */
	public abstract Iterator<MenuComponent> createIterator();

	/**
	 * 
	 */
	public abstract void resetIterator();

}
