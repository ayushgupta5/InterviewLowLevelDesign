package Service.Wallet;

import Model.Wallet.Wallet;

public interface IWalletService {
    void deposit(Wallet wallet);
    void withdraw(Wallet wallet);
    void transferFunds(Wallet wallet);
    void checkBalance(Wallet wallet);
}
