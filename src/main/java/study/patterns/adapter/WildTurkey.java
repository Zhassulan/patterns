package study.patterns.adapter;

import study.patterns.adapter.interfaces.ITurkey;

public class WildTurkey implements ITurkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
