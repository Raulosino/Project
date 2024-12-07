package com.expensetracker;

import com.expensetracker.model.Category;
import com.expensetracker.model.Expense;
import com.expensetracker.service.ExpenseTracker;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();

        // Add categories
        Category food = new Category("Food", "Meals and groceries");
        Category transport = new Category("Transport", "Travel and commute");

        tracker.addCategory(food);
        tracker.addCategory(transport);

        // Add expenses
        Expense expense1 = new Expense(15.50, LocalDate.now(), "Lunch", food);
        Expense expense2 = new Expense(50.00, LocalDate.now(), "Train ticket", transport);

        tracker.addExpense(expense1);
        tracker.addExpense(expense2);

        // List all expenses
        System.out.println("\nAll Expenses:");
        tracker.listAllExpenses();

        // Remove an expense
        tracker.removeExpenseById(expense1.getId().toString());

        System.out.println("\nAfter Removing One Expense:");
        tracker.listAllExpenses();
    }
}