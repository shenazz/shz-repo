/**
 * 
 */
package com.shenaz.util.patterns.composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author shenaz
 *
 */
public class CompositeIterator implements Iterator<MenuComponent> {

	private Stack<Iterator<MenuComponent>> stack;

	/**
	 * @param iterator
	 */
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		this.stack = new Stack<>();
		this.stack.push(iterator);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		}

		Iterator<MenuComponent> itemIterator = stack.peek();
		if (itemIterator.hasNext()) {
			return true;
		} else {
			stack.pop();
			return hasNext();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#next()
	 */
	@Override
	public MenuComponent next() {
		if (hasNext()) {
			MenuComponent item = stack.peek().next();
			if (item instanceof Menu) {
				Iterator<MenuComponent> iterator = item.createIterator();
				stack.push(iterator);
			}
			return item;
		} else {
			return null;
		}
	}

}
