package org.example;


import org.example.CLI.ExpenseTrackerCommand;
import picocli.CommandLine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Expense Tracker Started. Type 'exit' to quit.");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {

                System.out.println("Goodbye!");
                break;
            }

            if (input.isEmpty()) {
                continue;
            }

            String[] commandArgs = input.split("\\s+");

            new CommandLine(new ExpenseTrackerCommand()).execute(commandArgs);
        }

        scanner.close();
    }
}