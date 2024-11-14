# E-Commerce Platform (Amazon-like System)

## Overview

This project implements a simple e-commerce platform modeled after Amazon. The system allows users to search products, add items to a shopping cart, checkout, and place orders. It also includes payment processing, inventory management, and an order tracking system.

## Features

- **User Management**: Register, login, and manage user profiles.
- **Product Search**: Users can browse and search for products.
- **Shopping Cart**: Users can add items to the cart, view cart contents, and calculate the total.
- **Checkout & Payment**: Users can proceed to checkout and make payments.
- **Order Tracking**: After placing an order, users can track its status.
- **Inventory Management**: Products' stock is updated in real-time as users make purchases.


## Main Components

### 1. **User**
Represents a user in the system. Handles user registration, login, and profile management.

- **Attributes**: `userId`, `username`, `email`, `password`, `shippingAddress`
- **Methods**:
    - `login()`: Logs the user in.
    - `register()`: Registers a new user.
    - `logout()`: Logs the user out.

### 2. **Product**
Represents a product available for purchase.

- **Attributes**: `productId`, `name`, `description`, `price`, `quantity`
- **Methods**:
    - `getDetails()`: Returns product details such as name, description, and price.
    - `updateStock()`: Updates product stock when a purchase is made.

### 3. **ShoppingCart** (Singleton Pattern)
Manages the shopping cart for a user session. Ensures there is only one instance of the cart per session.

- **Attributes**: `items[]` (a list of products)
- **Methods**:
    - `addItem()`: Adds a product to the cart.
    - `removeItem()`: Removes a product from the cart.
    - `getTotal()`: Calculates the total price of all items in the cart.

### 4. **Order**
Represents an order made by a user, including details of purchased items.

- **Attributes**: `orderId`, `userId`, `totalAmount`, `status`
- **Methods**:
    - `placeOrder()`: Places an order for the user.
    - `trackOrder()`: Tracks the order status.

### 5. **Payment** (Factory Pattern)
Abstract class for processing payments. Different types of payments (e.g., credit card, PayPal) can be implemented using the Factory pattern.

- **Attributes**: `paymentId`, `orderId`, `amount`, `method`
- **Methods**:
    - `processPayment()`: Processes the payment for the order.

### 6. **PaymentFactory** (Factory Pattern)
Used to create instances of different payment methods.

- **Methods**:
    - `getPayment()`: Returns the appropriate payment object (e.g., CreditCardPayment) based on the payment type requested by the user.

## Design Patterns

- **Singleton Pattern**: Implemented in `ShoppingCart` to ensure a single instance of the cart per user session.
- **Factory Pattern**: Used in `PaymentFactory` to create different types of payment objects (e.g., credit card, PayPal).
- **SOLID Principles**: The project adheres to SOLID design principles for modularity, maintainability, and extensibility.


## How to Run

1. **Clone the Repository**:


