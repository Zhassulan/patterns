package study.patterns.factory;

import org.junit.Test;

public class FactoryTest {

    @Test
    public void factoryTest()   {
        PizzaStore nyStore = new NYStylePizzaStore();
        nyStore.orderPizza("cheese");
    }

}
