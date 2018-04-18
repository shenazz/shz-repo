/**
 * 
 */
package com.shenaz.util.patterns.composite;

import java.util.Iterator;

/**
 * @author shenaz
 *
 */
public class MenuItem extends MenuComponent {

	private String name;
	private boolean veg;

	/**
	 * @param name
	 */
	public MenuItem(String name, boolean veg) {
		this.name = name;
		this.veg = veg;
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
	 * @see com.shenaz.util.patterns.component.MenuComponent#print()
	 */
	@Override
	public void print() {
		System.out.println("Menu Item -> " + name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.util.patterns.component.MenuComponent#isVeg()
	 */
	@Override
	public boolean isVeg() {
		return veg;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.util.patterns.component.MenuComponent#getIterator()
	 */
	@Override
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.util.patterns.component.MenuComponent#clearIterator()
	 */
	@Override
	public void resetIterator() {
		// TODO Auto-generated method stub

	}

}
