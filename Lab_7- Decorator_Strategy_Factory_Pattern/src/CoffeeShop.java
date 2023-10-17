public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();

        Coffee espresso = coffeeFactory.createCoffee("Espresso");
        System.out.println("Order: " + espresso.getDescription() + ", Cost: $" + espresso.cost());

        Coffee latte = new Milk(coffeeFactory.createCoffee("Latte")); // Customize with Milk
        System.out.println("Order: " + latte.getDescription() + ", Cost: $" + latte.cost());

        Coffee cappuccino = new Vanilla(coffeeFactory.createCoffee("Cappuccino")); // Customize with Vanilla
        System.out.println("Order: " + cappuccino.getDescription() + ", Cost: $" + cappuccino.cost());

        PaymentGateway paymentGateway=new PaymentGateway(new CreditCard());
        paymentGateway.pay();
    }
}