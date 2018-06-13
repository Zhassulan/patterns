package study.patterns.factory;

public class NYStylePizzaStore extends PizzaStore {

    public NYStylePizzaStore() {

    }

    /*
    public NYStylePizzaStore() {
        name = "NY style sauce and cheese pizza";
        dough = "Thin crust dough";
        sauce = "Marinara sauce";

        toppings.add("Grated Reggiano Cheese");
    }
    */

    public Pizza createPizza(String item) {
        Pizza pizza = null;
        switch (item)   {
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
        }
        return pizza;
    }

}
