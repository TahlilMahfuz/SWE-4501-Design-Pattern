class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(IPizzaType pizzaType) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        return pizzaType.getPizza(ingredientFactory);
    }

}