//Factory Pattern
class CoffeeFactory {
    public Coffee createCoffee(String type) {
        if (type.equalsIgnoreCase("Espresso")) {
            return new Espresso();
        } else if (type.equalsIgnoreCase("Latte")) {
            return new Latte();
        }
        return null;
    }
}