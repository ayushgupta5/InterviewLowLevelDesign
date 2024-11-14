package Main;

import Model.Admin.Admin;
import Model.Car.Car;
import Model.Customer.Customer;
import Model.Feedback.Feedback;
import Model.Payment.Payment;
import Model.Rental.Rental;
import Model.User.User;
import Service.Admin.AdminService;
import Service.Admin.IAdminService;
import Service.Car.CarService;
import Service.Car.ICarService;
import Service.Customer.CustomerService;
import Service.Customer.ICustomerService;
import Service.Feedback.FeedbackService;
import Service.Feedback.IFeedbackService;
import Service.Payment.CreditCard;
import Service.Payment.PaymentService;
import Service.Payment.PaymentStrategy;
import Service.Payment.UPI;
import Service.Rental.IRentalService;
import Service.Rental.RentalService;
import Service.User.IUserService;
import Service.User.UserService;

import java.time.LocalDateTime;

public class CarRentalSystemApp {
    public static void main(String[] args) {

        LocalDateTime paymentDate = LocalDateTime.now();
        LocalDateTime startDate = paymentDate;
        LocalDateTime endDate = paymentDate.plusHours(1);
        User user1 = new User(1, "Kohli", "kohli@gmail.com", "***", "123", "Admin");
        User user2 = new User(1, "Customer", "customer@gmail.com", "***", "123", "Admin");
        Car car = new Car(1, "Audi", "2024", 100.00, "Free");
        Rental rental = new Rental(1, 1, 1, 100.00, "Free");
        Feedback feedback = new Feedback(1, 1, 1, 5, "Awesome");
        Admin admin = new Admin(user1.getUserID(), user1.getName(), user1.getEmail(), user1.getPasswordHash(), user1.getPhoneNumber(), user1.getRole());
        Customer customer = new Customer(user2.getUserID(), user2.getName(), user2.getEmail(), user2.getPasswordHash(), user2.getPhoneNumber(), user2.getRole());

        Payment payment = new Payment(1, 1, 100.00, paymentDate, "UPI");

        IUserService userService = new UserService();
        userService.register();
        userService.login(user1);
        userService.login(user2);
        userService.viewBookingHistory(user2);

        ICarService carService = new CarService();
        carService.addCar(car);
        carService.removeCar(car);
        carService.searchCar(car);
        carService.updateCar(car);

        IRentalService rentalService = new RentalService();
        rentalService.bookCar(rental);
        rentalService.returnCar(rental);
        rentalService.calculateTotalAmount(rental);

        IFeedbackService feedbackService = new FeedbackService();
        feedbackService.leaveFeedback(feedback);

        IAdminService adminService = new AdminService();
        adminService.addCar(admin);
        adminService.removeCar(admin);
        adminService.updateCar(admin);

        ICustomerService customerService = new CustomerService();
        customerService.bookCar(customer);
        customerService.leaveFeedback(customer);
        customerService.searchCar(customer);
        customerService.makePayment(customer);

        paymentFunction(payment);
        payment.setPaymentMethod("CreditCard");
        paymentFunction(payment);
    }

    private static void paymentFunction(Payment payment) {
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
