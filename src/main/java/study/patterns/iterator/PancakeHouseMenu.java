package study.patterns.iterator;

import study.patterns.iterator.interfaces.Menu;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {

    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("KB Pancake Breakfast", "Pancake eggs", true, 2.93);
        addItem("Regular Pancake Breakfast", "Pancake with frieed eggs", false, 3.1);
        addItem("Waffles", "Waffles with your choice", true, 1.5);
    }

    public void addItem(String name, String description, boolean vegetarian, double price)  {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator()   {
        return menuItems.iterator();
    }
}
