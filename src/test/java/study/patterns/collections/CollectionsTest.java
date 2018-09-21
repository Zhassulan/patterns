package study.patterns.collections;

import org.junit.Test;
import study.patterns.iterator.DinerMenu;
import study.patterns.iterator.PancakeHouseMenu;
import study.patterns.iterator.Waitress;

public class CollectionsTest {

    @Test
    public void collectionsTest()   {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }

}
