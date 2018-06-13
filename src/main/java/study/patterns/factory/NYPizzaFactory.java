package study.patterns.factory;

public class NYPizzaFactory {

    public static Pizza createPizza(String type)   {
        Pizza pizza = null;
        switch (type)   {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
        }
        return pizza;
    }

}
