public class PeperoniPizza extends Pizza implements IPizzaType{
    PizzaIngredientFactory ingredientFactory;

    public PeperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.ingredientFactory=pizzaIngredientFactory;
    }

    @Override
    public void getSalt() {
        System.out.println("Give salt");
    }

    @Override
    public PeperoniPizza getPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        return new PeperoniPizza(pizzaIngredientFactory);
    }

    @Override
    public String getPizzaName() {
        return "PeproniPizza";
    }

    @Override
    void prepare() {

    }
}
