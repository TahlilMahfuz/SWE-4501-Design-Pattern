abstract class PizzaStore {
    abstract Pizza createPizza(IPizzaType pizzaType);

    Pizza orderPizza(IPizzaType pizzaType) {
        return createPizza(pizzaType);
    }
}