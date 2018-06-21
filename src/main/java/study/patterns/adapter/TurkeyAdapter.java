package study.patterns.adapter;

import study.patterns.adapter.interfaces.IDuck;
import study.patterns.adapter.interfaces.ITurkey;

public class TurkeyAdapter implements IDuck {

    ITurkey turkey;

    public TurkeyAdapter(ITurkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
