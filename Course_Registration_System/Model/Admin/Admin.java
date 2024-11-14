package Model.Admin;

import Model.User.User;

public class Admin extends User {
    private int adminID;

    public Admin(int userID, String name, String email, String passwordHash, int adminID) {
        super(userID, name, email, passwordHash);
        this.adminID = adminID;
    }
}
