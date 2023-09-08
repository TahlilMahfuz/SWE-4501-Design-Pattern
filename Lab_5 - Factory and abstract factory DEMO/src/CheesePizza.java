public class CheesePizza extends Pizza implements IPizzaType{
    PizzaIngredientFactory ingredientFactory;
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    void prepare() {

    }

    @Override
    public void getSalt() {

    }

    @Override
    public CheesePizza getPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        return new CheesePizza(pizzaIngredientFactory);
    }

    @Override
    public String getPizzaName() {
        return "Cheese Pizza";
    }
}
