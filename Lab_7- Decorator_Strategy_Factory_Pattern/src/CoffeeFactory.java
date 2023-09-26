class CoffeeFactory {
    public Coffee createCoffee(String type) {
        if (type.equalsIgnoreCase("Espresso")) {
            return new Espresso();
        } else if (type.equalsIgnoreCase("Latte")) {
            return new Latte();
        } else if (type.equalsIgnoreCase("Cappuccino")) {
            return new Cappuccino();
        }
        return null;
    }
}