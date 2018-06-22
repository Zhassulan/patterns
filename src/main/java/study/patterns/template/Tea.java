package study.patterns.template;

public class Tea extends CoffeinBeverage {
    
    public void addCondiments() {
        System.out.println("Adding lemon");
    }

    public void brew() {
        System.out.println("Steeping the tea");
    }

}
