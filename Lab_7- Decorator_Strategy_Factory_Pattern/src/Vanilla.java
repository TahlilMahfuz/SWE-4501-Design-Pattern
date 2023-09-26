class Vanilla extends CoffeeDecorator {
    public Vanilla(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.75;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Vanilla";
    }
}