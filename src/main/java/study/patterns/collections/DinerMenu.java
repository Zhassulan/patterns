package study.patterns.collections;

import study.patterns.collections.interfaces.IIterator;
import study.patterns.collections.interfaces.Menu;

import java.util.Iterator;

public class DinerMenu implements Menu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem [] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "Bacon with lettuce & tomato", false, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato", false, 2.99);
        addItem("Hotdog", "A hot dog", false, 3.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price)  {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full");
        }   else    {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public MenuItem [] getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator()   {
        return new DinerMenuIterator(menuItems);
    }

}
