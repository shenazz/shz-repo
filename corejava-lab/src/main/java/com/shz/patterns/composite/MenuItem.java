/**
 * 
 */
package com.shz.patterns.composite;

import java.util.Iterator;

/**
 * @author shenaz
 *
 */
public class MenuItem extends MenuComponent {

	private String name;

	private String link;

	/**
	 * @param name
	 */
	public MenuItem(String name, String link) {
		this.name = name;
		this.link = link;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shz.patterns.composite.MenuComponent#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shz.patterns.composite.MenuComponent#getLink()
	 */
	@Override
	public String getLink() {
		return link;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shz.patterns.composite.MenuComponent#print()
	 */
	@Override
	public void print() {
		System.out.println(name + " -> " + link);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shz.patterns.composite.MenuComponent#createIterator()
	 */
	@Override
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}
}
