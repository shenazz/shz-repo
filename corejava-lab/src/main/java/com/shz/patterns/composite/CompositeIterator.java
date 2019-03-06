/**
 * 
 */
package com.shz.patterns.composite;

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
		stack = new Stack<>();
		stack.push(iterator);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		if (stack.isEmpty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
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
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();
			if (component instanceof Menu) {
				stack.push(component.createIterator());
			}
			return component;
		} else {
			return null;
		}
	}

}
