public class PaymentGateway{
    IPaymentMethod paymentMethod;

    public PaymentGateway(IPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void pay(){
        paymentMethod.pay();
    }
}
