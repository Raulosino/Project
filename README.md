Here’s a comprehensive `README.md` file for your **Expense Tracker** application. It describes the project, its structure, and functionality.

---

# Expense Tracker Application

## Overview
The **Expense Tracker Application** is a console-based Java application that allows users to manage their expenses. Users can:
- Add new expenses.
- View all recorded expenses.
- Export expenses to a file for storage.

This application is built with a clean structure, including models, services, and utilities, and ensures robust input validation and error handling.

---

## Features
- **Add Expenses**: Input expense details such as amount, description, and category.
- **View Expenses**: Display all recorded expenses with details like date and category.
- **Export to File**: Save the list of expenses in a CSV file for external usage.
- **Predefined Data**: Preloaded with sample categories and expenses.
- **Error Handling**: Handles invalid inputs and file operation errors gracefully.

---

## Project Structure
The project is organized into packages for modularity and clarity:

```
com.expensetracker
    ├── model
    │   ├── Category.java       // Represents an expense category
    │   └── Expense.java        // Represents an individual expense
    ├── service
    │   ├── ExpenseService.java // Interface for expense operations
    │   └── ExpenseTracker.java // Main application logic
    ├── util
    │   ├── ExpenseStorage.java // Handles expense storage and file operations
    │   └── ExpenseInitializer.java // Initializes the application with predefined data
```

---

## Classes and Their Responsibilities

### 1. **Model Classes**
- **`Category`**:
  - Represents a category for expenses (e.g., "Food", "Transport").
  - Fields:
    - `String name`: Name of the category.
    - `String description`: Description of the category.
  - Methods:
    - Getters and setters.
    - `toString()`: Converts the category object to a readable string.

- **`Expense`**:
  - Represents an individual expense.
  - Fields:
    - `UUID id`: Unique identifier for the expense.
    - `double amount`: Amount spent.
    - `LocalDate date`: Date of the expense.
    - `String description`: Short description of the expense.
    - `Category category`: Category of the expense.
  - Methods:
    - Getters and setters.
    - Constructor to initialize an expense with all fields.

---

### 2. **Service Classes**
- **`ExpenseService`** (Interface):
  - Defines core methods for managing expenses:
    - `addExpense(String description, double amount, Category category)`: Add a new expense.
    - `showExpenses()`: Display all expenses.
    - `getAllExpenses()`: Retrieve a list of all expenses.

- **`ExpenseTracker`** (Main Application):
  - Provides the main menu and user interaction logic.
  - Key Methods:
    - **`addExpense()`**: Prompts the user to input expense details and adds it to storage.
    - **`showExpenses()`**: Displays all recorded expenses.
    - **`exportExpensesToFile()`**: Saves the list of expenses to a file.
    - **`run()`**: Main menu loop to interact with the user.
  - Includes robust input validation and error handling:
    - Ensures amount is a positive number.
    - Ensures non-empty input for strings (e.g., description, category).
    - Handles invalid menu choices and unexpected errors.

---

### 3. **Utility Classes**
- **`ExpenseStorage`**:
  - Manages expense data in memory and handles file operations.
  - Key Methods:
    - `addExpense(Expense expense)`: Adds an expense to the list.
    - `getAllExpenses()`: Returns the list of expenses.
    - `saveExpensesToFile(String fileName)`: Writes the list of expenses to a file in CSV format.
  - Handles file write errors gracefully.

- **`ExpenseInitializer`**:
  - Provides predefined categories and expenses for initial setup.
  - Key Method:
    - `initialize(ExpenseStorage storage)`: Adds predefined categories and expenses to the storage.

---

## Validations and Error Handling
- **Amount Validation**:
  - Ensures the user enters a positive amount.
  - Handles invalid number inputs (e.g., non-numeric values).
- **String Validation**:
  - Ensures non-empty input for descriptions and category names.
- **File Operations**:
  - Handles errors during file writing (e.g., invalid file paths).
- **General Error Handling**:
  - Catches unexpected runtime exceptions and provides user-friendly messages.

---

## Example Usage

### Menu Options:
```
Choose an option:
1. Add expense
2. Show all expenses
3. Export expenses to file
4. Exit
```

### Adding an Expense:
```
Enter amount: 100
Enter description: Lunch
Enter category (e.g., Food, Transport): Food
Expense added successfully!
```

### Viewing Expenses:
```
Amount: 50.0, Date: 2024-12-10, Description: Lunch at a restaurant, Category: Food
Amount: 30.0, Date: 2024-12-10, Description: Bus ticket, Category: Transport
```

### Exporting to File:
```
Enter file name to save expenses: expenses.csv
Expenses have been saved to expenses.csv
```

---

## File Storage
- Expenses are saved in CSV format with the following structure:
  ```
  Amount,Date,Description,Category
  50.0,2024-12-10,Lunch at a restaurant,Food
  30.0,2024-12-10,Bus ticket,Transport
  ```
- The file name is provided by the user during export.

---

## Future Enhancements
- Add functionality to edit or delete expenses.
- Implement a database for persistent storage.
- Build a graphical user interface (GUI) or web application frontend.
- Categorize expenses with subcategories (e.g., "Food -> Groceries").
