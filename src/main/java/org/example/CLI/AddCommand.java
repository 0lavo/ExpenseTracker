package org.example.CLI;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.ArrayList;

@Command(name = "add", description = "Adds a new expense")
public class AddCommand extends AbstractCommand implements Runnable{

    @Option(names = {"--amount", "-a"}, required = true, description = "The amount of the expense.")
    private double amount;

    @Option(names = {"--description", "-d"}, required = true, description = "The description of the expense.")
    private String description;

    @Override
    public void run() {
        expenseController.addExpense(amount, description);
        System.out.println("Added the expense: $" + amount + " || " + description);
    }
}
