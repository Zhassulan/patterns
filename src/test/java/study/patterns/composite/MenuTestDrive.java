package study.patterns.composite;

import org.junit.Test;

public class MenuTestDrive {

    @Test
    public void compositeTest() {
        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "Breakfast");
        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Lunch");
        MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert or course!");

        MenuComponent allMenus = new Menu("All Menus", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        dinnerMenu.add(new MenuItem("Pasta", "Spaghetti with marinara sauce, and slice of sourdoughbread", true, 3.89));
        dinnerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
