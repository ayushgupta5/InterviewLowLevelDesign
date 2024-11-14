package Model.Faculty;

import Model.User.User;

public class Faculty extends User {
    private int facultyID;

    public Faculty(int userID, String name, String email, String passwordHash, int facultyID) {
        super(userID, name, email, passwordHash);
        this.facultyID = facultyID;
    }
}
