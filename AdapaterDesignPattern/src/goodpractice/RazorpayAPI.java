package goodpractice;

public class RazorpayAPI {
    public void makePayment(String invoiceId, double amount) {
        System.out.println("Paid rs. " + amount + " using the razor-pay APi: " + invoiceId);
    }
}
