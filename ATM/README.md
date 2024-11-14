# ATM System - Java Project

## Overview

This is a simple Java-based ATM system that allows users to perform basic banking operations such as withdrawing and depositing money, checking account balances, and managing transactions. The system is designed using **SOLID principles** and implements the **Strategy Design Pattern** to handle different types of transactions.

## Key Classes and Design Pattern Explanation

### 1. ATM Class

- **Attributes**:
    - `cashDispenser`: Responsible for dispensing cash.
    - `cardReader`: Responsible for reading and validating the user's card.

- **Methods**:
    - `authenticate()`: Authenticates the user using card details and PIN.
    - `performTransaction()`: Performs a transaction by delegating to a strategy (e.g., withdraw, deposit).

### 2. Account Class

- **Attributes**:
    - `balance`: Stores the current account balance.

- **Methods**:
    - `getBalance()`: Retrieves the current balance.
    - `deposit()`: Adds a specified amount to the account.
    - `withdraw()`: Deducts an amount from the balance, ensuring there are sufficient funds.

### 3. Transaction Interface (Strategy Pattern)

- **Method**:
    - `execute()`: Declares a method for executing a transaction (withdrawal or deposit). The Strategy Pattern allows for different strategies for transactions.

### 4. WithdrawTransaction and DepositTransaction Classes

- **Attributes**:
    - `amount`: The amount of money involved in the transaction.

- **Methods**:
    - `execute()`: Implements the logic for withdrawing or depositing money.

## How to Run

### Prerequisites

- Ensure you have **Java 8+** installed on your system.

### Steps

1. **Compile the code**: Run the following command in the project root directory:

   ```bash
   javac src/*.java
