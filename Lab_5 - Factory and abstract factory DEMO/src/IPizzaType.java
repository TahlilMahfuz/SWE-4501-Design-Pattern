public interface IPizzaType {
    void getSalt();
    Pizza getPizza(PizzaIngredientFactory pizzaIngredientFactory);
    String getPizzaName();
}
