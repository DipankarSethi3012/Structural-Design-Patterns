package badpractice;

public class Main {
    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService(new PayUGateway());
        checkoutService.pay("1234", 124.67);
        //razorpay can't implement this interface because of different contract
    }
}
