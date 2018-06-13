package study.patterns.factory;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago style deep dish cheese pizza";
        dough = "Extra thick crust dough";
        sauce = "Plum tomato sauce";

        toppings.add("Shredded mozzarella cheese");
    }

    void cut()  {
        System.out.println("Cutting the pizza into square slices");
    }
}
