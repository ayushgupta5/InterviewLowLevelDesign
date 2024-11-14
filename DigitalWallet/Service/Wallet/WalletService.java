package Service.Wallet;

import Model.Wallet.Wallet;

public class WalletService implements IWalletService {
    @Override
    public void deposit(Wallet wallet) {
        System.out.println("Deposit: " + wallet.toString());
    }

    @Override
    public void withdraw(Wallet wallet) {
        System.out.println("Withdraw from Wallet : " + wallet.toString());
    }

    @Override
    public void transferFunds(Wallet wallet) {
        System.out.println("Transfer Funds from Wallet : " + wallet.toString());
    }

    @Override
    public void checkBalance(Wallet wallet) {
        System.out.println("Check Balance from Wallet : " + wallet.toString());
    }
}
