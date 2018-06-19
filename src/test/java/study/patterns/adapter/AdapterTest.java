package study.patterns.adapter;

import org.junit.Test;
import study.patterns.adapter.interfaces.Duck;

public class AdapterTest {

    @Test
    public void adapterTest()   {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says..");
        turkey.gobble();
        turkey.fly();

        System.out.println("The duck says..");
        testDuck(duck);

        System.out.println("The TurkeyAdapter says..");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
