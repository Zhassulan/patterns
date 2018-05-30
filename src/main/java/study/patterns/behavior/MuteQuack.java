package study.patterns.behavior;

import study.patterns.behavior.interfaces.IQuackBehavior;

public class MuteQuack implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
