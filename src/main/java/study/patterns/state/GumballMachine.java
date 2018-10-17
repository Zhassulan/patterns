package study.patterns.state;

public class GumballMachine {

    //состояния
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state;
    private int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0)  {
            state = noQuarterState;
        }
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter()  {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        releaseBall();
    }

    void setState(State state)  {
        this.state = state;
    }

    void releaseBall()  {
        System.out.println("A gumball comes rolling out the slot..");
        if (count != 0) {
            count -= 1;
        }
    }

    @Override
    public String toString() {
        String strState = null;
        if (state instanceof SoldOutState)  {
            strState = "SOLD_OUT";
        }
        if (state instanceof NoQuarterState)  {
            strState = "NO_QUARTER";
        }
        if (state instanceof HasQuarterState)  {
            strState = "HAS_QUARTER";
        }
        if (state instanceof SoldState)  {
            strState = "SOLD";
        }
        return "State of GumballMachine {" + "state = \"" + strState + "\", gumballs count = " + count + '}';
    }
}
