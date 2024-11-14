package Main;

import Model.Card.Card;
import Model.Transaction.Transaction;
import Model.User.User;
import Model.Wallet.Wallet;
import Service.Card.CardService;
import Service.Card.ICardService;
import Service.Transaction.ITransactionService;
import Service.Transaction.TransactionService;
import Service.User.IUserService;
import Service.User.UserService;
import Service.Wallet.IWalletService;
import Service.Wallet.WalletService;

public class DigitalWalletApp {
    public static void main(String[] args) {
        User user = new User(1, "Kohli", "kohli@gmail.com");
        Wallet wallet = new Wallet(1, 1, 100.00);
        Transaction transaction = new Transaction(1, 1, 100.00, "ONLINE");
        Card card = new Card(1, 1, 111, 123);

        IUserService userService = new UserService();
        userService.register();
        userService.login(user);
        userService.viewTransactions(user, transaction);

        IWalletService walletService = new WalletService();
        walletService.checkBalance(wallet);
        walletService.deposit(wallet);
        walletService.withdraw(wallet);
        walletService.transferFunds(wallet);

        ITransactionService transactionService = new TransactionService();
        transactionService.createTransaction(transaction);

        ICardService cardService = new CardService();
        cardService.addCard(card);
        cardService.removeCard(card);
        userService.logout(user);
    }
}
