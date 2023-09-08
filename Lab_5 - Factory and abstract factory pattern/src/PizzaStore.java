abstract class PizzaStore {
    abstract Pizza createPizza(String type);
    Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("Sorry, we don't have that pizza.");
        }
        return pizza;
    }
}