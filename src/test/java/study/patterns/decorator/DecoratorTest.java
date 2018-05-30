package study.patterns.decorator;

import org.junit.Test;

public class DecoratorTest {

    @Test
    public void decoratorTest() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
