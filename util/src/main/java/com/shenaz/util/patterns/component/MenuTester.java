/**
 * 
 */
package com.shenaz.util.patterns.component;

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
		MenuItem puttu = new MenuItem("Puttu", true);
		MenuItem beefFry = new MenuItem("Beef Fry", false);
		Menu malabarMenu = new Menu("Malabar");
		malabarMenu.add(beefFry);
		Menu keralaMenu = new Menu("Kerala");
		keralaMenu.add(puttu);
		keralaMenu.add(malabarMenu);

		MenuItem dalFry = new MenuItem("Dal Fry", true);
		MenuItem butterChicken = new MenuItem("Butter Chicken", false);
		Menu punjabiMenu = new Menu("Punjabi");
		punjabiMenu.add(butterChicken);
		punjabiMenu.add(dalFry);

		Menu indiaMenu = new Menu("Indian");
		indiaMenu.add(keralaMenu);
		indiaMenu.add(punjabiMenu);

		indiaMenu.print();

		Iterator<MenuComponent> iterator = indiaMenu.createIterator();
		while (iterator.hasNext()) {
			MenuComponent item = iterator.next();
			try {
				if (item.isVeg()) {
					System.out.println(item.getName() + " is Veg");
				} else {
					System.out.println(item.getName() + " is Non Veg");
				}
			} catch (UnsupportedOperationException e) {
			}
		}

		iterator = indiaMenu.createIterator();
		while (iterator.hasNext()) {
			MenuComponent item = iterator.next();
			try {
				if (item.isVeg()) {
					System.out.println(item.getName() + " is Veg");
				} else {
					System.out.println(item.getName() + " is Non Veg");
				}
			} catch (UnsupportedOperationException e) {
			}
		}

	}

}
