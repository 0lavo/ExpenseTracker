package org.example.CLI;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "delete", description = "Delete a expense by id")
public class DeleteCommand extends AbstractCommand implements Runnable {

    @Option(names = "--id", required = true, description = "The id of deleted expense")
    private int id;

    @Override
    public void run() {
        expenseController.deleteExpense(id);
        System.out.println("Deleted the expense with id: " + id);
    }
}
