package study.patterns.adapter;

import org.junit.Test;
import study.patterns.adapter.interfaces.IDuck;

public class AdapterTest {

    @Test
    public void adapterTest()   {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        IDuck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says..");
        turkey.gobble();
        turkey.fly();

        System.out.println("The duck says..");
        testDuck(duck);

        System.out.println("The TurkeyAdapter says..");
        testDuck(turkeyAdapter);
    }

    static void testDuck(IDuck duck) {
        duck.quack();
        duck.fly();
    }

}
