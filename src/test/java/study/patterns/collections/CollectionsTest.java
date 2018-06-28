package study.patterns.collections;

import org.junit.Test;

public class CollectionsTest {

    @Test
    public void collectionsTest()   {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }

}
