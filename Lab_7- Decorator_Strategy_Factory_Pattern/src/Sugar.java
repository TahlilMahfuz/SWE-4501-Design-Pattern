class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }
}