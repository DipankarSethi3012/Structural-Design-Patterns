package goodpractice;

public class PayUGateway implements PaymentGateway{
    @Override
    public void pay(String orderId, double amount) {
        System.out.println("Paid rs. " + amount + " using the payU: " + orderId);
    }
}
