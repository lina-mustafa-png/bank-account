# Bank Accounts System (Java)

This project implements a simplified **banking system** using **object-oriented programming in Java**. It was developed as part of **COE318 – Digital Systems (Lab 4)** and focuses on core OOP concepts such as classes, encapsulation, arrays, and method validation.

The system models individual bank accounts and a bank that manages multiple accounts while enforcing real-world constraints.

---

## Objectives

- Implement an `Account` class from scratch
- Implement a `Bank` class using arrays and loops
- Enforce rules for deposits, withdrawals, and account creation
- Practice object-oriented design without relying on templates
- Validate functionality using provided test drivers

---

## Project Overview

The project consists of two main classes:

### Account
Represents a single bank account with:
- Account owner name
- Account number
- Current balance

Only valid banking operations are allowed:
- Deposits must be **positive**
- Withdrawals must be **positive** and **≤ current balance**

Each operation returns a boolean indicating success or failure.

### Bank
Represents a bank that:
- Stores multiple `Account` objects in an array
- Prevents duplicate account numbers
- Tracks the maximum number of accounts allowed
- Provides account lookup and creation functionality

---

## Implemented Classes

### `Account`
**Methods:**
- `String getName()`
- `int getNumber()`
- `double getBalance()`
- `boolean deposit(double amount)`
- `boolean withdraw(double amount)`

Includes a predefined `toString()` method to display account details in a standardized format.

---

### `Bank`
- Stores accounts using an array
- Uses loops to manage and search accounts
- Prevents duplicate account numbers
- Reports the number of active accounts

---

### Test Drivers
- `MainAccount.java` — tests the `Account` class
- `MainBank.java` — tests the `Bank` class and account creation logic

---

## Tools Used

- **Java**
- **NetBeans IDE**
- **Object-Oriented Programming (OOP)**

---

## Key Concepts Demonstrated

- Encapsulation and data validation
- Object relationships (Bank → Account)
- Array-based storage
- Loop-based searching and condition checking
- Defensive programming using boolean return values

---

Developed as part of COE318 – Digital Systems coursework.


