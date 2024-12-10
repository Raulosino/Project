package com.expensetracker.util;

import com.expensetracker.model.Expense;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExpenseStorage {
    private List<Expense> expenses;

    public ExpenseStorage() {
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public List<Expense> getAllExpenses() {
        return expenses;
    }

    public void saveExpensesToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Write header
            writer.write("Amount,Date,Description,Category\n");

            // Write each expense
            for (Expense expense : expenses) {
                writer.write(expense.getAmount() + "," + expense.getDate() + "," + expense.getDescription() + "," + expense.getCategory().getName() + "\n");
            }
            System.out.println("Expenses have been saved to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the file: " + e.getMessage());
        }
    }
}
