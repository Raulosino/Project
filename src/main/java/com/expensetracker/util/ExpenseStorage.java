package com.expensetracker.util;

import com.expensetracker.model.Expense;
import java.util.ArrayList;
import java.util.List;

public class ExpenseStorage {

    private List<Expense> expenses;

    public ExpenseStorage() {
        expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public List<Expense> getAllExpenses() {
        return expenses;
    }

    public void saveToFile() {
        // Code to save expenses to a file
    }

    public void loadFromFile() {
        // Code to load expenses from a file
    }
}
