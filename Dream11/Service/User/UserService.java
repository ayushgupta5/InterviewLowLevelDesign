package Service.User;

import Model.Payment.Payment;
import Model.User.User;

public class UserService implements IUserService {
    @Override
    public void register() {
        System.out.println("User is Registering");
    }

    @Override
    public void login(User user) {
        System.out.println("User is Logging In : " +user.toString());
    }

    @Override
    public void logout(User user) {
        System.out.println("User is Logging Out : " +user.toString());
    }

    @Override
    public void addFunds(User user, Payment payment) {
        System.out.println("User is Adding the Fund  : " +user.toString() + " Payment: " +payment.toString());
    }

    @Override
    public void withdrawFunds(User user, Payment payment) {
        System.out.println("User is Withdrawing the Fund  : " +user.toString() + " Payment: " +payment.toString());
    }
}
