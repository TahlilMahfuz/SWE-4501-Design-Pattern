public class Main {
    public static void main(String[] args) {
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        chicagoStore.createPizza(new CheesePizza(new ChicagoPizzaIngredientFactory()));
    }
}