package com.expensetracker.service;

import com.expensetracker.model.Category;
import com.expensetracker.model.Expense;
import java.util.List;

public interface ExpenseService {
    void addExpense(String description, double amount, Category category);

    void addExpense(String description, double amount, String category);
    void showExpenses();
    List<Expense> getAllExpenses();
}