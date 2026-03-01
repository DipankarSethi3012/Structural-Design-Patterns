package goodpractice;

public class PaymentFactory {

    public static PaymentGateway getPaymentGateway(String choice) {
        PaymentGateway paymentGateway;
        if(choice.equalsIgnoreCase("razorpay")) {
            paymentGateway = new RazorPayAdapter();
        } else if(choice.equalsIgnoreCase("stripe")) {
            paymentGateway = new StripeAdapter();
        } else if(choice.equalsIgnoreCase("payU")) {
            paymentGateway = new PayUGateway();
        } else  {
            throw new IllegalArgumentException(choice + " method is not available");
        }

        return paymentGateway;
    }
}
