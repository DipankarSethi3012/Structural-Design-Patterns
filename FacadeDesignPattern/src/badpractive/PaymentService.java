package badpractive;

public class PaymentService {
    public void makePayment(String orderId, double amount) {
        System.out.println("payment for: " + orderId + " for: " + amount);
    }
}
