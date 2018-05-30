package study.patterns.behavior;

import org.junit.Test;

public class BehaviorTest {

    @Test
    public void behaviorTest()  {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }

}
