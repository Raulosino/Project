package com.expensetracker.service;

import com.expensetracker.model.Category;
import com.expensetracker.model.Expense;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseTracker {
    private List<Expense> expenses;
    private Map<String, Category> categories;

    public ExpenseTracker() {
        this.expenses = new ArrayList<>();
        this.categories = new HashMap<>();
    }


    public void addExpense(Expense expense) {
        expenses.add(expense);
        System.out.println("Expense added: " + expense);
    }

    public boolean removeExpenseById(String id) {
        return expenses.removeIf(expense -> expense.getId().toString().equals(id));
    }

    public void listAllExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
        } else {
            for (Expense expense : expenses) {
                System.out.println(expense);
            }
        }
    }

    public void addCategory(Category category) {
        if (!categories.containsKey(category.getName())) {
            categories.put(category.getName(), category);
            System.out.println("Category added: " + category);
        } else {
            System.out.println("Category already exists.");
        }
    }

    public Category getCategory(String categoryName) {
        return categories.getOrDefault(categoryName, null);
    }
}
