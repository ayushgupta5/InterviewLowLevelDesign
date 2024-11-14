package Service.Account;

import Model.Account.Account;

public class AccountService implements IAccountService {
    @Override
    public void getBalance(Account account) {
        System.out.println("Getting the Account Balance: " +account.toString());
    }

    @Override
    public void deposit(Account account) {
        System.out.println("Deposit Account Balance: " +account.toString());
    }

    @Override
    public void withdraw(Account account) {
        System.out.println("Withdraw the Account Balance: " +account.toString());
    }
}
