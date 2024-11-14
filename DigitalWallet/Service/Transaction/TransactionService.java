package Service.Transaction;

import Model.Transaction.Transaction;

public class TransactionService implements ITransactionService {
    @Override
    public void createTransaction(Transaction transaction) {
        System.out.println("Creating the Transaction : " + transaction.toString());
    }
}
