package org.example.CLI;

import org.example.Expense;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

import java.util.ArrayList;

@Command(name = "add", description = "Adds a new expense")
public class AddCommand extends AbstractCommand implements Runnable{

    @Parameters(index = "0", description = "The amount of the expense.")
    private double amount;

    @Parameters(index = "1", description = "The description of the expense.")
    private String description;

    @Override
    public void run() {
        expenseController.addExpense(amount, description);
        System.out.println("Added the expense: $" + amount + " || " + description);
    }
}
