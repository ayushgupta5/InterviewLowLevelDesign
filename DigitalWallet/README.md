# Digital Wallet System

## Overview

This project implements a simple digital wallet system where users can manage their funds, perform transactions, and manage cards. It follows a basic structure to demonstrate the use of Java classes, methods, and design patterns.

### Features:
1. **User Account Management**
    - Register a new user
    - Log in and log out
    - View transaction history

2. **Wallet Management**
    - Deposit money into the wallet
    - Withdraw money from the wallet
    - Transfer funds to another user's wallet
    - Check wallet balance

3. **Transaction Management**
    - Record and view transactions

4. **Card Management**
    - Add or remove cards from the user’s account

## Classes

### 1. **User**
- **Attributes**:
    - `userId`: Unique identifier for the user.
    - `username`: The name of the user.
    - `passwordHash`: A hashed version of the user's password.
    - `email`: The user's email address.

- **Methods**:
    - `register()`: Registers a new user.
    - `login()`: Logs in a user.
    - `logout()`: Logs out the user.
    - `viewTransactions()`: Displays the user's transaction history.

### 2. **Wallet**
- **Attributes**:
    - `walletId`: Unique identifier for the wallet (linked to `userId`).
    - `userId`: ID of the wallet owner.
    - `balance`: Current balance in the wallet.

- **Methods**:
    - `deposit()`: Adds funds to the wallet.
    - `withdraw()`: Withdraws funds from the wallet if sufficient balance is available.
    - `transferFunds()`: Transfers funds to another wallet.
    - `checkBalance()`: Displays the current balance.
    - `viewTransactionHistory()`: Shows all transactions.

### 3. **Transaction**
- **Attributes**:
    - `transactionId`: Unique identifier for the transaction.
    - `walletId`: ID of the wallet associated with the transaction.
    - `amount`: The amount involved in the transaction.
    - `type`: Type of transaction (DEPOSIT, WITHDRAWAL, TRANSFER).
    - `timestamp`: Date and time when the transaction occurred.

- **Methods**:
    - `createTransaction()`: Constructor to initialize a transaction.
    - `toString()`: Returns a string representation of the transaction.

### 4. **Card**
- **Attributes**:
    - `cardId`: Unique identifier for the card.
    - `userId`: ID of the user who owns the card.
    - `cardNumber`: The card number (simplified for the example).
    - `expirationDate`: Expiration date of the card.
    - `cvv`: Security code of the card.

- **Methods**:
    - `addCard()`: Adds a card to the user account.
    - `removeCard()`: Removes a card from the user account.

## How to Run

1. Clone the repository.
2. Navigate to the `src` folder.
3. Compile the Java files using a Java compiler, e.g., `javac`.
4. Run the `User`, `Wallet`, `Transaction`, or `Card` classes to see the example functionality.

## Example

```java
public class Main {
    public static void main(String[] args) {
        User user = new User(1, "JohnDoe", "hashedPassword123", "john@example.com");
        user.register();
        user.login();

        // Depositing money
        user.wallet.deposit(100.0);

        // Checking balance
        user.wallet.checkBalance();

        // Viewing transaction history
        user.viewTransactions();

        // Transfer money to another user
        User recipient = new User(2, "JaneDoe", "hashedPassword456", "jane@example.com");
        user.wallet.transferFunds(recipient.wallet, 50.0);

        // Viewing updated balance
        user.wallet.checkBalance();
        recipient.wallet.checkBalance();

        user.logout();
    }
}
