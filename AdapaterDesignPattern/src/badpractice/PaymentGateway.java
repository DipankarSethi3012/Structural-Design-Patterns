package badpractice;

//target interface
//standard interface expected by the checkout-service
public interface PaymentGateway {
    void pay(String orderId, double amount);
}
