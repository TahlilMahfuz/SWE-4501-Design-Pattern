class CaliforniaPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();

        if ("cheese".equalsIgnoreCase(type)) {
            return new CheesePizza(ingredientFactory);
        } else if ("pepperoni".equalsIgnoreCase(type)) {
            return new PepperoniPizza(ingredientFactory);
        } else {
            System.out.println("Invalid pizza type: " + type);
            return null;
        }
    }
}