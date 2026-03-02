package org.example.CLI;


import picocli.CommandLine.Command;

@Command(
        name = "expense-tracker",
        version = "1.0",
        mixinStandardHelpOptions = true,
        description = "An application to manage expenses.",
        subcommands = {
                AddCommand.class,
                DeleteCommand.class,
                ListCommand.class
        }
)
public class ExpenseTrackerCommand implements Runnable{
    @Override
    public void run() {
        System.out.println("Please specify a command. Type 'expense-tracker --help' for options.");
    }
}
