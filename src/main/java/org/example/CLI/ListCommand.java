package org.example.CLI;

import picocli.CommandLine.Command;

@Command(name = "list", description = "List all expenses.")
public class ListCommand extends AbstractCommand implements Runnable {


    @Override
    public void run() {
        System.out.println("A list of all expenses");
        expenseController.listAll();
    }
}
