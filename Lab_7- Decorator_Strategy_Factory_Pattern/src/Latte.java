class Latte implements Coffee {
    @Override
    public double cost() {
        return 3.5;
    }

    @Override
    public String getDescription() {
        return "Latte";
    }
}