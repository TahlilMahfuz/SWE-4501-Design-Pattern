// Decorator Pattern
abstract class CondimentDecorator implements Coffee {
    protected Coffee coffee;

    public CondimentDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public abstract double cost();

    @Override
    public abstract String getDescription();
}