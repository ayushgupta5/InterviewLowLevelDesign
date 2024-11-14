package Service.User;

import Model.Transaction.Transaction;
import Model.User.User;

public interface IUserService {
    void register();
    void login(User user);
    void logout(User user);
    void viewTransactions(User user, Transaction transaction);
}
