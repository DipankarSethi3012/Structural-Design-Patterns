package goodpractice;

public class Main {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = PaymentFactory.getPaymentGateway("razorpay");
        CheckoutService checkoutService = new
                CheckoutService(paymentGateway);
        checkoutService.pay("123", 123.78);

        PaymentGateway paymentGateway1 = PaymentFactory.getPaymentGateway("stripe");
        CheckoutService checkoutService1 = new CheckoutService(paymentGateway1);
        checkoutService1.pay("234", 234.67);

        PaymentGateway paymentGateway2 = PaymentFactory.getPaymentGateway("payU");
        CheckoutService checkoutService2 = new
                CheckoutService(paymentGateway2);
        checkoutService2.pay("345656",345.67 );
    }
}
