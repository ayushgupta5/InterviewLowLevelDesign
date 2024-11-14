package Service.Transaction;

import Model.Account.Account;

public class DepositTransaction implements TransactionStrategy {
    @Override
    public void execute(Account account) {
        System.out.println("Deposit Transaction is in Process : " + account.toString());
    }
}
