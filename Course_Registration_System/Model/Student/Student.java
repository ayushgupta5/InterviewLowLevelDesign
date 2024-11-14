package Model.Student;

import Model.User.User;

public class Student extends User {
    private int studentID;

    public Student(int userID, String name, String email, String passwordHash, int studentID) {
        super(userID, name, email, passwordHash);
        this.studentID = studentID;
    }
}
