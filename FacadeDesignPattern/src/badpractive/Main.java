package badpractive;

public class Main {
    public static void main(String[] args) {
        //Booking a movie ticket manually without a facade
        PaymentService paymentService = new PaymentService();
        paymentService.makePayment("user123", 500.23);

        SeatReservationService seatReservationService = new SeatReservationService();
        seatReservationService.bookSeat("123", "234");

        LoyaltyPointService loyaltyPointService = new LoyaltyPointService();
        loyaltyPointService.addPoints("user123", 50);

        TicketService ticketService = new TicketService();
        ticketService.getTicket("movie256", "A10");
    }
}
