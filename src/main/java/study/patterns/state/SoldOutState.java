package study.patterns.state;

public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sorry, all gumballs are sold out");
        ejectQuarter();
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Please, take back your quarter");
        gumballMachine.ejectQuarter();
    }

    @Override
    public void turnCrank() {
        System.out.println("Sorry, all gumballs are sold out");
    }

    @Override
    public void dispense() {
        System.out.println("Sorry, all gumballs are sold out");
    }
}
