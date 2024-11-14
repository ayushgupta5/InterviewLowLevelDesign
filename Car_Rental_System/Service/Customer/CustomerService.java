package Service.Customer;

import Model.Customer.Customer;

public class CustomerService implements ICustomerService {
    @Override
    public void searchCar(Customer customer) {
        System.out.println("Customer is Searching the Car : " + customer.toString());
    }

    @Override
    public void bookCar(Customer customer) {
        System.out.println("Customer is Booking the Car : " + customer.toString());
    }

    @Override
    public void makePayment(Customer customer) {
        System.out.println("Customer is Making the Payment for the Car : " + customer.toString());
    }

    @Override
    public void leaveFeedback(Customer customer) {
        System.out.println("Customer is Leaving the Feedback : " + customer.toString());
    }
}
