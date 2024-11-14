package Service.Account;

import Model.Account.Account;

public interface IAccountService {
    void getBalance(Account account);
    void deposit(Account account);
    void withdraw(Account account);
}
