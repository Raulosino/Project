package com.expensetracker.model;

import java.time.LocalDate;
import java.util.UUID;

public class Expense {
    private UUID id;
    private double amount;
    private LocalDate date;
    private String description;
    private Category category;

    // Constructor
    public Expense(double amount, LocalDate date, String description, Category category) {
        this.id = UUID.randomUUID();
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.category = category;
    }

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
