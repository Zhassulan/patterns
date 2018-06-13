package study.patterns.factory;

public class ChicagoStylePizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type)   {
            case "cheese":
                pizza = new ChicagoStyleCheesePizza();
                break;
        }
        return pizza;
    }
}
