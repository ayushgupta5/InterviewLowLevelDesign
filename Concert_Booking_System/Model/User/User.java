package Model.User;

public class User {
    private int userID;
    private String name;
    private String email;
    private String passwordHash;

    public User(int userID, String name, String email, String passwordHash) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
