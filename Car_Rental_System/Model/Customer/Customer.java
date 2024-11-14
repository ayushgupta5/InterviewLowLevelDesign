package Model.Customer;

import Model.User.User;

public class Customer extends User {
    public Customer(int userID, String name, String email, String passwordHash, String phoneNumber, String role) {
        super(userID, name, email, passwordHash, phoneNumber, role);
    }
}
