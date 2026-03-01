package goodpractice;

public class StripeAdapter implements PaymentGateway{
    private final StripeAPI stripeAPI;

    public StripeAdapter() {
        this.stripeAPI = new StripeAPI();
    }

    @Override
    public void pay(String orderId, double amount) {
        stripeAPI.doPayment(orderId, amount);
    }
}
