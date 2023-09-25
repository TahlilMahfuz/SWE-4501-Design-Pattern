class Milk extends CondimentDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.0;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }
}