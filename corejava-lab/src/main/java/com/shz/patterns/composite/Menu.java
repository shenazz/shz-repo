/**
 * 
 */
package com.shz.patterns.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author shenaz
 *
 */
public class Menu extends MenuComponent {

	private String name;

	private List<MenuComponent> children;

	/**
	 * @param name
	 */
	public Menu(String name) {
		this.name = name;
		this.children = new ArrayList<>();
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
	 * @see com.shz.patterns.composite.MenuComponent#print()
	 */
	@Override
	public void print() {
		System.out.println(name);
		Iterator<MenuComponent> iterator = children.iterator();
		while (iterator.hasNext()) {
			iterator.next().print();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shz.patterns.composite.MenuComponent#getChildern()
	 */
	@Override
	public List<MenuComponent> getChildern() {
		return children;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shz.patterns.composite.MenuComponent#addChildern(com.shz.patterns.composite.MenuComponent)
	 */
	@Override
	public void addChildern(MenuComponent child) {
		children.add(child);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shz.patterns.composite.MenuComponent#createIterator()
	 */
	@Override
	public Iterator<MenuComponent> createIterator() {
		return new CompositeIterator(children.iterator());
	}
}
