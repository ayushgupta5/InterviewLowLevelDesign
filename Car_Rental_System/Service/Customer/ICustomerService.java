package Service.Customer;

import Model.Customer.Customer;

import javax.swing.text.html.CSS;

public interface ICustomerService {
    void searchCar(Customer customer);
    void bookCar(Customer customer);
    void makePayment(Customer customer);
    void leaveFeedback(Customer customer);
}
