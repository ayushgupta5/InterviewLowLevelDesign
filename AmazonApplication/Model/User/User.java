package Model.User;

public class User {
    // userId, username, email, password, shippingAddress
    private int userID;
    private String userName;
    private String email;
    private String passwordHash;
    private String shippingAddress;

    public User(int userID, String userName, String email, String passwordHash, String shippingAddress) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.passwordHash = passwordHash;
        this.shippingAddress = shippingAddress;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                '}';
    }
}
