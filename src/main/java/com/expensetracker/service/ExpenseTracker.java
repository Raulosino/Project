package com.expensetracker.service;

import com.expensetracker.model.Category;
import com.expensetracker.model.Expense;
import com.expensetracker.util.ExpenseStorage;
import com.expensetracker.util.ExpenseInitializer;

import java.util.Scanner;

public class ExpenseTracker {

    private final ExpenseStorage storage;
    private final Scanner scanner;

    public ExpenseTracker() {
        this.storage = new ExpenseStorage();
        this.scanner = new Scanner(System.in);
        // Initialize predefined categories and expenses
        ExpenseInitializer.initialize(storage);
    }

    // Method to add an expense
    public void addExpense() {
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        System.out.print("Enter category (e.g., Food, Transport): ");
        String categoryName = scanner.nextLine();
        Category category = new Category(categoryName, ""); // You can add description or additional properties later

        Expense expense = new Expense(amount, java.time.LocalDate.now(), description, category);
        storage.addExpense(expense);
        System.out.println("Expense added successfully!");
    }

    // Method to display all expenses
    public void showExpenses() {
        storage.getAllExpenses().forEach(expense -> {
            System.out.println("Amount: " + expense.getAmount() + ", Date: " + expense.getDate() + ", Description: " + expense.getDescription() + ", Category: " + expense.getCategory().getName());
        });
    }

    // Method to export expenses to a file
    public void exportExpensesToFile() {
        System.out.print("Enter file name to save expenses: ");
        String fileName = scanner.nextLine();
        storage.saveExpensesToFile(fileName);
    }

    // Run method to interact with user
    public void run() {
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add expense");
            System.out.println("2. Show all expenses");
            System.out.println("3. Export expenses to file");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    showExpenses();
                    break;
                case 3:
                    exportExpensesToFile();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();
        tracker.run();
    }
}
