class Cappuccino implements Coffee {
    @Override
    public double cost() {
        return 4.0;
    }

    @Override
    public String getDescription() {
        return "Cappuccino";
    }
}