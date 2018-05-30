package study.patterns.behavior;

import study.patterns.behavior.interfaces.IQuackBehavior;

public class Squeak implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
