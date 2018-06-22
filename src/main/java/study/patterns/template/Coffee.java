package study.patterns.template;

public class Coffee extends CoffeinBeverage {

    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    void brew() {
        System.out.println("Dripping coffee through filter");
    }

}
