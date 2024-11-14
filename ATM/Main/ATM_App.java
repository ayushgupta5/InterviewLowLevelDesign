package Main;

import Model.ATM.ATM;
import Model.Account.Account;
import Service.ATM.ATMService;
import Service.ATM.IATMService;
import Service.Account.AccountService;
import Service.Account.IAccountService;
import Service.Transaction.DepositTransaction;
import Service.Transaction.TransactionService;
import Service.Transaction.TransactionStrategy;
import Service.Transaction.WithdrawTransaction;

public class ATM_App {
    public static void main(String[] args) {
        ATM atm = new ATM("CashDispenser", "CardReader");
        Account account = new Account(100.00);

        IATMService atmService = new ATMService();
        atmService.authenticate(atm);
        atmService.performTransaction(atm);

        IAccountService accountService = new AccountService();
        accountService.deposit(account);
        accountService.getBalance(account);
        accountService.withdraw(account);

        TransactionStrategy transactionStrategy = new DepositTransaction();
        TransactionService transactionService = new TransactionService();
        transactionService.setTransactionStrategy(transactionStrategy);

        transactionService.executeTransaction(account);
        transactionStrategy = new WithdrawTransaction();
        transactionService.setTransactionStrategy(transactionStrategy);
        transactionService.executeTransaction(account);
    }
}
