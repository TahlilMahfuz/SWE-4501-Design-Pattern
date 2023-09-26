public class CreditCard implements IPaymentMethod{
    @Override
    public void pay() {
        System.out.println("Payment completed through Credit Card");
    }
}
