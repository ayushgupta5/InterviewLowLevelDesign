package Model.Admin;

import Model.User.User;

public class Admin extends User {
    public Admin(int userID, String name, String email, String passwordHash, String phoneNumber, String role) {
        super(userID, name, email, passwordHash, phoneNumber, role);
    }
}
