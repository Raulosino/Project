### README.md

# Expense Tracker Application

This is a simple **Expense Tracker Application** written in Java. The application allows users to manage their expenses by adding, viewing, and saving them to a file. The project is structured to be extensible and follows good coding practices.

---

## Features

- Add new expenses with details like amount, date, description, and category.
- View all expenses.
- Save expenses to a file for persistence.

---

## Project Structure

The project is organized into packages to ensure clear separation of concerns:

1. **`com.expensetracker.model`**
   - Contains the data models used in the application, such as `Expense` and `Category`.
2. **`com.expensetracker.service`**
   - Handles the business logic and operations on the data.
3. **`com.expensetracker.util`**
   - Provides utility classes for saving and loading files.
4. **`com.expensetracker`**
   - Contains the main application class and the entry point.

---

## Classes Overview

### 1. `Expense` (Model)

Represents an individual expense.

- **Fields**:
  - `UUID id`: Unique identifier for the expense.
  - `double amount`: The monetary value of the expense.
  - `LocalDate date`: The date of the expense.
  - `String description`: Description or details of the expense.
  - `Category category`: The category to which the expense belongs.

- **Constructor**:
  Initializes an expense with the specified amount, date, description, and category.

- **Methods**:
  - Getters and setters for fields.
  - `toString()`: Returns a string representation of the expense.

---

### 2. `Category` (Model)

Represents a category to which an expense belongs.

- **Fields**:
  - `String name`: Name of the category.
  - `String description`: Description of the category.

- **Constructor**:
  Initializes a category with the specified name and description.

- **Methods**:
  - Getters and setters for fields.
  - `toString()`: Returns a string representation of the category.

---

### 3. `ExpenseStorage` (Service)

Handles the management of expenses.

- **Fields**:
  - `List<Expense> expenses`: Stores all expenses in memory.

- **Methods**:
  - `addExpense(Expense expense)`: Adds a new expense to the list.
  - `getExpenses()`: Returns the list of all expenses.
  - `saveExpensesToFile(List<Expense> expenses)`: Saves expenses to a file named `expenses.txt` in the project directory.
  - `loadExpensesFromFile()`: Loads expenses from the `expenses.txt` file.

---

### 4. `ExpenseTracker` (Main Application)

Entry point for the application.

- **Description**:
  The main class allows the user to interact with the application through a console-based menu. Users can:
  - Add expenses.
  - View all expenses.
  - Save expenses to a file.

- **Structure**:
  - A `Scanner` is used to read user input.
  - The menu is displayed in a loop to allow continuous operations.

---

### 5. `PredefinedData` (Utility)

Provides predefined categories and expenses.

- **Fields**:
  - A static list of default categories and expenses.
- **Methods**:
  - `getDefaultCategories()`: Returns a list of predefined categories.
  - `getDefaultExpenses()`: Returns a list of predefined expenses.

---

### How It Works

1. **Adding Expenses**:
   - Users provide the amount, description, and category for a new expense.
   - The expense is stored in memory.

2. **Viewing Expenses**:
   - Displays all saved expenses along with their details.

3. **Saving Expenses**:
   - Writes all expenses to a file (`expenses.txt`).

4. **Loading Expenses**:
   - Reads expenses from `expenses.txt` when the application starts.

---

## How to Run the Application

1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd expense-tracker
   ```

2. **Build the Project**:
   Ensure you have Maven installed and run:
   ```bash
   mvn clean install
   ```

3. **Run the Application**:
   Execute the `ExpenseTracker` main class:
   ```bash
   java -cp target/expense-tracker-1.0-SNAPSHOT.jar com.expensetracker.ExpenseTracker
   ```

---

## File Storage

- All expenses are saved to a file named `expenses.txt` in the project directory.
- Example content:
  ```
  UUID: 123e4567-e89b-12d3-a456-426614174000, Amount: 50.0, Date: 2024-12-10, Description: Lunch, Category: Food
  ```

---

## Future Enhancements

- Add support for editing or deleting expenses.
- Integrate a database for persistent storage.
- Build a GUI or web interface for the application.

---

Feel free to extend or modify the application as needed! 😊
