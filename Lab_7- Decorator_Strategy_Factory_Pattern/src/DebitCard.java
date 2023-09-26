public class DebitCard implements IPaymentMethod{
    @Override
    public void pay() {
        System.out.println("Payment completed through Debit Card");
    }
}
