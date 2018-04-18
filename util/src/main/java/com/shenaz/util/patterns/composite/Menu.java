/**
 * 
 */
package com.shenaz.util.patterns.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author shenaz
 *
 */
public class Menu extends MenuComponent {

	private String name;
	private List<MenuComponent> items;
	private Iterator<MenuComponent> iterator;

	/**
	 * z
	 * 
	 * @param name
	 */
	public Menu(String name) {
		this.name = name;
		this.items = new ArrayList<>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.util.patterns.component.MenuComponent#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.shenaz.util.patterns.component.MenuComponent#add(com.shenaz.util.
	 * patterns.component.MenuComponent)
	 */
	@Override
	public void add(MenuComponent menuComponent) {
		items.add(menuComponent);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.util.patterns.component.MenuComponent#print()
	 */
	@Override
	public void print() {
		System.out.println("---- " + name + " Menu -----");
		items.forEach(item -> item.print());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.util.patterns.component.MenuComponent#getIterator()
	 */
	@Override
	public Iterator<MenuComponent> createIterator() {
		if (iterator == null) {
			iterator = new CompositeIterator(items.iterator());
		}

		return iterator;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.util.patterns.component.MenuComponent#clearIterator()
	 */
	@Override
	public void resetIterator() {
		iterator = null;
		items.forEach(item -> item.resetIterator());

	}

}
