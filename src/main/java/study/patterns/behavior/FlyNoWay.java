package study.patterns.behavior;

import study.patterns.behavior.interfaces.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
