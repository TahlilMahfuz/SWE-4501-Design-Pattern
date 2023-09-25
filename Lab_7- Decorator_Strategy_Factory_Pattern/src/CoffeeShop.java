public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();

        Coffee espresso = coffeeFactory.createCoffee("Espresso");
        System.out.println("Order: " + espresso.getDescription() + ", Cost: $" + espresso.cost());

        Coffee latte = coffeeFactory.createCoffee("Latte");
        System.out.println("Order: " + latte.getDescription() + ", Cost: $" + latte.cost());

        // Add condiments using Decorator Pattern
        Coffee latteWithMilkAndSugar = new Sugar(new Milk(new Latte()));
        System.out.println("Order: " + latteWithMilkAndSugar.getDescription() + ", Cost: $" + latteWithMilkAndSugar.cost());

        // Apply pricing strategy using Strategy Pattern
        PricingStrategy regularStrategy = new RegularPricingStrategy();
        PricingStrategy happyHourStrategy = new HappyHourPricingStrategy();

        double regularPrice = regularStrategy.calculatePrice(latteWithMilkAndSugar.cost());
        double happyHourPrice = happyHourStrategy.calculatePrice(latteWithMilkAndSugar.cost());

        System.out.println("Regular Price: " + regularPrice);
        System.out.println("Happy Hour Price: " + happyHourPrice);
    }
}