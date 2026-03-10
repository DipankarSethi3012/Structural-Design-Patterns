package goodpractice;

import badpractive.LoyaltyPointService;
import badpractive.PaymentService;
import badpractive.SeatReservationService;
import badpractive.TicketService;

public class MovieFacade {
    private final PaymentService paymentService;
    private final SeatReservationService seatReservationService;
    private final LoyaltyPointService loyaltyPointService;
    private final TicketService ticketService;

    public MovieFacade(PaymentService paymentService, SeatReservationService seatReservationService, LoyaltyPointService loyaltyPointService, TicketService ticketService) {
        this.paymentService = paymentService;
        this.seatReservationService = seatReservationService;
        this.loyaltyPointService = loyaltyPointService;
        this.ticketService = ticketService;
    }


    public void bookMovieTicket(String accountId, String movieId, String seatNumber, String userEmail, double amount) {
        paymentService.makePayment(accountId, amount);
        seatReservationService.bookSeat(movieId, seatNumber);
        ticketService.getTicket(movieId, seatNumber);
        loyaltyPointService.addPoints(accountId, 50);

        System.out.println("Done");
    }
}

//Later we can use builder to avoid constructor telescoping,
//adding abstracting in the payment service (RazorPay, Stripe) -> Adding the concrete classes and then adding factory to decide which objects to get,
//That's how the production level code works