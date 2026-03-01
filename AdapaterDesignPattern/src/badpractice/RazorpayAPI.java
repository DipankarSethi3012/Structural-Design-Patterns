package badpractice;

//Adaptee
//an existing class with an incompatible interface
public class RazorpayAPI {
    public void makePayment(String invoiceId, double amountInRupees) {
        System.out.println("Paid rs: " + amountInRupees + " for the order: " + invoiceId);
    }
}
