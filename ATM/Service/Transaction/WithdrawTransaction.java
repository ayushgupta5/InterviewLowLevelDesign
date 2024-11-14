package Service.Transaction;

import Model.Account.Account;

public class WithdrawTransaction implements TransactionStrategy {
    @Override
    public void execute(Account account) {
        System.out.println("Withdraw Transaction is in Process : " + account.toString());
    }
}
