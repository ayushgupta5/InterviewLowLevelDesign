package Service.Transaction;

import Model.Account.Account;

public class TransactionService {
    TransactionStrategy transactionStrategy;
    public void setTransactionStrategy(TransactionStrategy transactionStrategy) {
        this.transactionStrategy = transactionStrategy;
    }
    public void executeTransaction(Account account) {
        transactionStrategy.execute(account);
    }
}
