package study.patterns.adapter;

import study.patterns.adapter.interfaces.IDuck;

public class MallardDuck implements IDuck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
