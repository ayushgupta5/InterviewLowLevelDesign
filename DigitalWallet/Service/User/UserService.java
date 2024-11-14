package Service.User;

import Model.Transaction.Transaction;
import Model.User.User;

public class UserService implements IUserService {
    @Override
    public void register() {
        System.out.println("User is Registering");
    }

    @Override
    public void login(User user) {
        System.out.println("User is Logging In : " + user.toString());
    }

    @Override
    public void logout(User user) {
        System.out.println("User is Logging Out : " + user.toString());
    }

    @Override
    public void viewTransactions(User user, Transaction transaction) {
        System.out.println("User is Viewing the Transaction : " + user.toString() + " Transaction : " +transaction.toString());
    }
}
