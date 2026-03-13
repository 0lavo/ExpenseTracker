package org.example;

import java.util.ArrayList;

public class ExpenseController {

    private final ArrayList<Expense> expenseList;


    public ExpenseController() {
        expenseList = new ArrayList<>();
    }

    public void addExpense(double amount, String description) {
        expenseList.add(new Expense(amount, description));
    }

    public void deleteExpense(int id) {
        expenseList.removeIf(e -> e.getId() == id);
    }

    public void listAll() {
        for (Expense e : expenseList) {
            System.out.println(e);
        }
    }

    public void summary() {
        double totalExpenses = 0;

        for (Expense e : expenseList) {
            totalExpenses += e.getAmount();
        }

        System.out.println("The total of expenses is: " + totalExpenses);
    }

    public void summary(Integer month) {
        double totalExpenses = 0;

        for (Expense e : expenseList) {
            if (e.getDate().getMonthValue() == month) totalExpenses += e.getAmount();
        }

        System.out.println("The total of expenses is: " + totalExpenses);
    }
}
