package study.patterns.behavior;

import study.patterns.behavior.interfaces.IFlyBehavior;
import study.patterns.behavior.interfaces.IQuackBehavior;

public abstract class Duck {

    IQuackBehavior quackBehavior;
    IFlyBehavior flyBehavior;

    public Duck() {
    }

    public abstract  void display();

    public void performQuack()  {
        quackBehavior.quack();
    }

    public void performFly()    {
        flyBehavior.fly();
    }

    public void swim()  {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(IFlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(IQuackBehavior qb) {
        quackBehavior = qb;
    }
}
