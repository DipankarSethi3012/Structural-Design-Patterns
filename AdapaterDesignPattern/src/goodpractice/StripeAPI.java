package goodpractice;

public class StripeAPI {
    public void doPayment(String orderId, double money) {
        System.out.println("Paid rs. " + money + " using stripe API: " + orderId);
    }
}
