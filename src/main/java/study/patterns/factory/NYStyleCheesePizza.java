package study.patterns.factory;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY style sauce and cheese pizza";
        dough = "thin crust dough";
        sauce = "Marinara sauce";

        toppings.add("Grated Reggiagno Cheese");
    }
}
