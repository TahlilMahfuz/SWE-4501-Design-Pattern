class HappyHourPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double cost) {
        return cost * 0.5; // 50% discount during happy hour
    }
}