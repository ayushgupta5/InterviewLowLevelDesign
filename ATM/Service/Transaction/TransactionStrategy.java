package Service.Transaction;

import Model.Account.Account;

public interface TransactionStrategy {
    void execute(Account account);
}
