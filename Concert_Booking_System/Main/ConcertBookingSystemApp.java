package Main;

import Model.Admin.Admin;
import Model.Booking.Booking;
import Model.Concert.Concert;
import Model.Payment.Payment;
import Model.User.User;
import Service.Admin.AdminService;
import Service.Admin.IAdminService;
import Service.Booking.BookingService;
import Service.Booking.IBookingService;
import Service.Concert.ConcertService;
import Service.Concert.IConcertService;
import Service.Payment.CreditCard;
import Service.Payment.PaymentService;
import Service.Payment.PaymentStrategy;
import Service.Payment.UPI;
import Service.User.IUserService;
import Service.User.UserService;

public class ConcertBookingSystemApp {
    public static void main(String[] args) {
        User user = new User(1, "Kohli", "kohli@gmail.com", "password");
        Admin admin = new Admin(1);
        Booking booking = new Booking(1, 1, 1, 111, "Sold");
        Concert concert = new Concert(1, "SRK", "Delhi", 111, 1);
        Payment payment = new Payment(1, 1, 100.00, "UPI");

        IUserService userService = new UserService();
        userService.register();
        userService.login(user);

        IAdminService adminService = new AdminService();
        adminService.removeConcert(admin, concert);
        adminService.viewStatistics(admin);
        adminService.addConcert(admin, concert);

        IBookingService bookingService = new BookingService();
        bookingService.bookTicket(booking);
        bookingService.cancelBooking(booking);

        IConcertService concertService = new ConcertService();
        concertService.searchConcerts(concert);


        makePayment(payment);
        payment.setPaymentMethod("CreditCard");
        makePayment(payment);
    }

    private static void makePayment(Payment payment) {
        PaymentStrategy paymentStrategy;
        if(payment.getPaymentMethod() == "UPI") {
            paymentStrategy = new UPI();
        } else {
            paymentStrategy = new CreditCard();
        }
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(paymentStrategy);
        paymentService.pay(payment);
    }
}
