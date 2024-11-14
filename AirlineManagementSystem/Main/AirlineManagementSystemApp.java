package Main;

import Model.Booking.Booking;
import Model.Employee.Employee;
import Model.Flight.Flight;
import Model.Passenger.Passenger;
import Model.Payment.Payment;
import Service.Booking.BookingService;
import Service.Booking.IBookingService;
import Service.Employee.EmployeeService;
import Service.Employee.IEmployeeService;
import Service.Flight.FlightService;
import Service.Flight.IFlightService;
import Service.Passenger.IPassengerService;
import Service.Passenger.PassengerService;
import Service.Payment.IPaymentService;
import Service.Payment.PaymentService;

import java.time.LocalDateTime;

public class AirlineManagementSystemApp {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(1, "KOHLI", "kohli@gmail.com", "123");
        LocalDateTime arrivalTime = LocalDateTime.now();
        LocalDateTime departureTime = arrivalTime.plusHours(1);
        Flight flight = new Flight(1, "123", departureTime, arrivalTime, "src", "dst");
        Booking booking = new Booking(1, "12", "Processing", "Processing");
        Payment payment = new Payment(1, 100.00, "UPI", "Paid");
        Employee employee = new Employee(1, "Kohli", "Passenger", "Boeing");

        IPassengerService passengerService = new PassengerService();
        passengerService.register(passenger);
        passengerService.cancelBooking(booking);
        passengerService.bookFlight(flight);

        IFlightService flightService = new FlightService();
        flightService.scheduleFlight(flight);
        flightService.updateFlight(flight);

        IBookingService bookingService = new BookingService();
        bookingService.cancel(booking);
        bookingService.makePayment(payment);

        IPaymentService paymentService = new PaymentService();
        paymentService.processPayment(payment);

        IEmployeeService employeeService = new EmployeeService();
        employeeService.assignFlight(flight);
    }
}
