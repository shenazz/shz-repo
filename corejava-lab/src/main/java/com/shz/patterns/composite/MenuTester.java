/**
 * 
 */
package com.shz.patterns.composite;

import java.util.Iterator;

/**
 * @author shenaz
 *
 */
public class MenuTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Menu topMenu = new Menu("Top");

		MenuItem topItem1 = new MenuItem("topitem1", "topItem1Link");
		topMenu.addChildern(topItem1);

		MenuItem topItem2 = new MenuItem("topitem2", "topItem2Link");
		topMenu.addChildern(topItem2);

		Menu subMenu = new Menu("Sub");
		MenuItem subItem1 = new MenuItem("subItem1", "subItem1Link");
		subMenu.addChildern(subItem1);
		MenuItem subItem2 = new MenuItem("subItem2", "subItem2Link");
		subMenu.addChildern(subItem2);
		Menu subSubMenu = new Menu("SubSub");
		MenuItem subSubItem1 = new MenuItem("subSubItem1", "subSubItem1Link");
		subSubMenu.addChildern(subSubItem1);
		subMenu.addChildern(subSubMenu);
		topMenu.addChildern(subMenu);

		//topMenu.print();

		System.out.println(topMenu.getName());
		final Iterator<MenuComponent> iterator = topMenu.createIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
	}

}
