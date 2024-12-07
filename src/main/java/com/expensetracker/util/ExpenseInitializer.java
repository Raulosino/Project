package com.expensetracker.util;

import com.expensetracker.model.Category;
import com.expensetracker.model.Expense;
import java.time.LocalDate;

public class ExpenseInitializer {

    public static void initialize(ExpenseStorage storage) {
        // Predefined categories
        Category food = new Category("Food", "Expenses related to food and dining");
        Category transport = new Category("Transport", "Expenses related to transport and commuting");
        Category entertainment = new Category("Entertainment", "Expenses related to entertainment and leisure");

        // Predefined expenses
        Expense expense1 = new Expense(50.0, LocalDate.now(), "Lunch at a restaurant", food);
        Expense expense2 = new Expense(30.0, LocalDate.now(), "Bus ticket", transport);
        Expense expense3 = new Expense(100.0, LocalDate.now(), "Movie night", entertainment);

        // Add expenses to storage
        storage.addExpense(expense1);
        storage.addExpense(expense2);
        storage.addExpense(expense3);

        System.out.println("Predefined categories and expenses initialized.");
    }
}
