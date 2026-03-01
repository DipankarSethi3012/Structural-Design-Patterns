package badpractice;

public class PayUGateway implements PaymentGateway{
    @Override
    public void pay(String orderId, double amount) {
        System.out.println("Paying for the order: " + orderId + " using PayU: " + amount);
    }
}
